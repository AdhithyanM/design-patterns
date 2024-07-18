package singleresponsibility.example1.followed;

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        NotificationService notificationService = new NotificationService();
        BookIssueService bookIssueService = new BookIssueService(bookManager, notificationService);

        Book book1 = new Book("Effect of Java", "author1");
        Book book2 = new Book("OOPS", "author2");

        bookManager.addBook(book1);
        bookManager.addBook(book2);

        bookIssueService.issueBook("Effect of Java");
        bookIssueService.returnBook("Effect of Java");
    }
}
