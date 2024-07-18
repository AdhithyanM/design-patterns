package singleresponsibility.example1.unfollowed;

public class Main {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();

        Book book1 = new Book("Effective Java", "Joshua Bloch");
        Book book2 = new Book("Clean Code", "Robert C. Martin");

        libraryService.addBook(book1);
        libraryService.addBook(book2);

        libraryService.issueBook("Effective Java");
        libraryService.returnBook("Effective Java");
    }
}
