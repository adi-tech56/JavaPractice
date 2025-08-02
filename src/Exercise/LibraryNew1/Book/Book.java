package Exercise.LibraryNew1.Book;


import Exercise.LibraryNew;
import Exercise.LibraryNew1.Transaction.TransactionData;

import java.util.Date;

import static Exercise.LibraryNew1.UserDisplay1.issuedTransactionList;
import static Exercise.LibraryNew1.UserDisplay1.returnTransactionList;
import static Exercise.LibraryNew1.UserDisplay1.issuedTransactionList;

public  class Book {
    private String bookId;
    private String name;
    private String author;
    public String possesionWithMemeberId;

    public Book(String bookId, String name, String author, String possesionWithMemeberId) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.possesionWithMemeberId = possesionWithMemeberId;
    }

    public String getBookId() {
        return bookId;
    }

    public String getName() {
        return name;
    }


    public boolean borrowBook(String memberId) {
        if (possesionWithMemeberId == null) {
            this.possesionWithMemeberId = memberId;
            TransactionData.IssueTransaction issueTransaction = new TransactionData.IssueTransaction(System.currentTimeMillis(), bookId, memberId, new Date());
            issuedTransactionList.add(issueTransaction);
            return true;
        }
        return false;
    }

    public boolean returnBook(String memberId) {
        if (possesionWithMemeberId != null) {
            this.possesionWithMemeberId = null;
            TransactionData.ReturnTransaction returnTransaction = new TransactionData.ReturnTransaction(System.currentTimeMillis(), bookId, memberId, new Date());
            returnTransactionList.add(returnTransaction);
            return true;
        }
        return false; // Not borrowed
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", possesionWithMemeberId='" + possesionWithMemeberId + '\'' +
                '}';
    }


}
