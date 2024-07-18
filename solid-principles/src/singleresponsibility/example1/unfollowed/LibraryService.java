package singleresponsibility.example1.unfollowed;

import java.util.ArrayList;
import java.util.List;

/*
    In this implementation, the LibraryService class is responsible for managing books, issuing books, and sending notifications.
    This violates the Single Responsibility Principle because the class has multiple reasons to change.
    */
public class LibraryService {
    private List<Book> books;
    private NotificationService notificationService;

    public LibraryService() {
        books = new ArrayList<>();
        notificationService = new NotificationService();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(String title) {
        for(Book book : books) {
            if(book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                book.setIssued(true);
                notificationService.sendNotification("Book Issued");
                return;
            }
        }
        System.out.println("The book with given title not available");
    }

    public void returnBook(String title) {
        for(Book book : books) {
            if(book.getTitle().equalsIgnoreCase(title) && book.isIssued()) {
                book.setIssued(false);
                notificationService.sendNotification("Book Returned");
                return;
            }
        }
        System.out.println("The book with given title either not available or issued");
    }
}
