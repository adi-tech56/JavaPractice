package Exercise.Library.Members;

import Exercise.Library.Books.Book;
import Exercise.Library.Transcations.Transcation;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String Name;
    private String MemberId;
    private List<Book> borrowedBooks;
    public ArrayList<Transcation> Borrow = new ArrayList<>();
    public ArrayList<Transcation> Return = new ArrayList<>();
    public Member(String Name,String MemberId) {
        this.Name=Name;
        this.MemberId = MemberId;
        this.borrowedBooks = new ArrayList<>();
    }
    public String getMemberId(){
      return MemberId;
    };
    public void setMemberId(){

    };
    public String getName(){
        return Name;
    };
    public void setName(){

    };
public List<Book> getBorrowedBooks(){
    return borrowedBooks;
};

    public boolean borrowBook(Book book) {
        if (book.borrowBook()) { // Attempt to mark the book as borrowed in the Book object
            borrowedBooks.add(book);
            String Id =book.getBId();
            System.out.println(MemberId + " borrowed " + Id);
            Transcation t = new Transcation(MemberId,Id);
            Borrow.add(t);
            return true;
        }
        System.out.println(book.getBId() + " is already borrowed.");
        return false;
    }
    public boolean returnBook(Book book) {
        if (borrowedBooks.remove(book)) { // Remove from member's borrowed list
            book.returnBook(); // Mark the book as returned in the Book object
            String RId =book.getBId();
            System.out.println(MemberId + " returned " + book.getBId());
            Transcation t = new Transcation(MemberId,RId);
            Return.add(t);
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
                System.out.println("- " + book.getBId() +" "+ book.getTitle());
            }
        }
    }
    @Override
    public String toString() {
        return "Name: " + Name + ", MemberId: " + MemberId + ", books: " + borrowedBooks;
    }
}
