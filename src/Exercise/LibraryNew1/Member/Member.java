package Exercise.LibraryNew1.Member;

import Exercise.LibraryNew;
import Exercise.LibraryNew1.Book.Book;

import java.util.List;

public class Member {

    private String memberId;
    private String name;
    private List<Book> borrowedBooks;

    public Member(String memberId, String name, List<Book> borrowedBooks) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }


    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (book.borrowBook(memberId)) { // Attempt to mark the book as borrowed in the Book object
            borrowedBooks.add(book);
            String id = book.getBookId();
            System.out.println(memberId + " borrowed " + id);
            return;
        }
        System.out.println(book.getBookId() + " is already borrowed.");
        return;
    }

    public boolean returnBook(Book book) {
        if (borrowedBooks.remove(book)) { // Remove from member's borrowed list
            book.returnBook(book.possesionWithMemeberId); // Mark the book as returned in the Book object
            String RId = book.getBookId();
            System.out.println(memberId + " returned " + book.getBookId());


            return true;
        }
        System.out.println(memberId + " did not have " + book.getBookId() + " borrowed.");
        return false;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
