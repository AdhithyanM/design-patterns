package singleresponsibility.example1.followed;

// Handles the responsibility of issuing and returning books.
public class BookIssueService {
    private BookManager bookManager;
    private NotificationService notificationService;

    public BookIssueService(BookManager bookManager, NotificationService notificationService) {
        this.bookManager = bookManager;
        this.notificationService = notificationService;
    }

    public void issueBook(String title) {
        Book book = bookManager.findBookByTitle(title);
        if (book != null && !book.isIssued()) {
            book.setIssued(true);
            notificationService.sendNotification("Sending Notification: The book \"" + title + "\" has been issued");
        } else {
            System.out.println("The book \"" + title + "\" is not available");
        }
    }

    public void returnBook(String title) {
        Book book = bookManager.findBookByTitle(title);
        if (book != null && book.isIssued()) {
            book.setIssued(false);
            notificationService.sendNotification("Sending Notification: The book \"" + title + "\" has been returned");
        } else {
            System.out.println("The book \"" + title + "\" was not issued to return");
        }
    }
}
