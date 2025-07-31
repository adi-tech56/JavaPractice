package Exercise.Library.Books;

public class Book {
    private String BId;
    private String Title;
    private String Author;
    private String Isbn;
    private Boolean Borrowed;

    public Book(String BId, String Title, String Author, String Isbn) {
        this.BId = BId;
        this.Title = Title;
        this.Author = Author;
        this.Isbn = Isbn;
        this.Borrowed = false;

    }

    public String getBId() {
        return BId;
    }

    // Setter method for bookId (optional, if bookId can be changed after creation)
    public void setBookId(String BId) {
        this.BId = BId;
    }

    // Getter method for title
    public String getTitle() {
        return Title;
    }

    // Setter method for title
    public void setTitle(String Title) {
        this.Title = Title;
    }

    // Getter method for author
    public String getAuthor() {
        return Author;
    }

    // Setter method for author
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String Isbn) {
        this.Isbn = Isbn;
    }

    public boolean isBorrowed() {
        return Borrowed;
    }

    // Override toString() for a readable representation of the Book object
    @Override
    public String toString() {
        return "Book ID: " + BId + ", Title: " + Title + ", Author: " + Author + ", Isbn: " + Isbn;
    }

    public boolean borrowBook() {
        if (!Borrowed) {
            this.Borrowed = true;
            return true;
        }
        return false;
    }
    public boolean returnBook() {
        if (Borrowed) {
            this.Borrowed = false;
            return true;
        }
        return false; // Not borrowed
    }
}
