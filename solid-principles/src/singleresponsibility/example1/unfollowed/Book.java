package singleresponsibility.example1.unfollowed;

public class Book {
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String title, String author) {
        this.author = author;
        this.isIssued = false;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public String getTitle() {
        return title;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }
}
