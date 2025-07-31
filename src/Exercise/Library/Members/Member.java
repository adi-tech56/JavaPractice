package Exercise.Library.Members;

import Exercise.Library.Books.Book;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String Name;
    private String MemberId;
    private List<Book> borrowedBooks;
    public Member(String Name,String MemberId) {
        this.Name=Name;
        this.MemberId = MemberId;
        this.borrowedBooks = new ArrayList<>();
    }
    public boolean borrowBook(Book book) {
        if (book.borrowBook()) { // Attempt to mark the book as borrowed in the Book object
            borrowedBooks.add(book);
            System.out.println(MemberId + " borrowed " + book.getBId());
            return true;
        }
        System.out.println(book.getBId() + " is already borrowed.");
        return false;
    }
    public boolean returnBook(Book book) {
        if (borrowedBooks.remove(book)) { // Remove from member's borrowed list
            book.returnBook(); // Mark the book as returned in the Book object
            System.out.println(MemberId + " returned " + book.getBId());
            return true;
        }
        System.out.println(MemberId + " did not have " + book.getBId() + " borrowed.");
        return false;
    }
    public void displayBorrowedBooks() {
        System.out.println(MemberId + "'s borrowed books:");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println("- " + book.getBId());
            }
        }
    }
    @Override
    public String toString() {
        return "Name: " + Name + ", MemberId: " + MemberId + ", books: " + borrowedBooks;
    }
}
