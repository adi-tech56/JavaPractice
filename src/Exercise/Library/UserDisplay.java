package Exercise.Library;

import Exercise.Library.Books.Book;
import Exercise.Library.Members.Member;
import Exercise.Library.Transcations.Transcation;

import java.util.ArrayList;
import java.util.Scanner;



public class UserDisplay {

    void showBooks() {
        ArrayList<Book> libraryBooks = new ArrayList<>();
        ArrayList<Member> members = new ArrayList<>();
        Book book1 = new Book("101", "The Great Gatsby", "F. Scott Fitzgerald", "ISBN101");
        Book book2 = new Book("102", "To Kill a Mockingbird", "Harper Lee", "ISBN102");
        Book book3 = new Book("103", "Little Woman", "Harper Lee", "ISBN103");
        // Add Book objects to the ArrayList
        Scanner s = new Scanner(System.in);
        libraryBooks.add(book1);
        libraryBooks.add(book2);
        libraryBooks.add(book3);
        Member m1 = new Member("Ram", "01");
        Member m2 = new Member("Sam", "02");
        Member m3 = new Member("Rita", "03");
        Member m4 = new Member("Sri", "04");
        members.add(m1);
        members.add(m2);
        members.add(m3);
        members.add(m4);
        System.out.println("Enter your MemberId");
        String MemeberID = s.nextLine();
        Member foundId = null;
        for (Member obj : members) {
            if (obj.getMemberId().equals(MemeberID)) {
                foundId = obj;
                break; // Stop after finding the first match
            }
        }
        if (foundId != null) {
            System.out.println("Member with Id: " + foundId.getMemberId() + ", ID: " + foundId.getName());

            System.out.println("Available book List");
            for (Book book : libraryBooks) {
                System.out.println(book);
            }
            System.out.println("Enter the book id to issue");
            String searchName = s.nextLine();
            Book foundObject = null;
            libraryBooks.stream().filter(b -> b.getBId() == searchName).count();
            for (Book obj : libraryBooks) {
                if (obj.getBId().equals(searchName)) {
                    foundObject = obj;
                    break; // Stop after finding the first match
                }
            }
            if (foundObject != null) {
                System.out.println("Found object with name: " + foundObject.getTitle() + ", ID: " + foundObject.getBId());
                foundId.borrowBook(foundObject);
            } else {
                System.out.println("Object not found.");
            }
            System.out.println(foundId);
            foundId.displayBorrowedBooks();
            System.out.println("Enter the book id to return");
            String bookID = s.nextLine();
            Book ReturnBook = null;
            System.out.println(foundId);
            ArrayList<Book> book = new ArrayList<>(foundId.getBorrowedBooks());

            for (Book obj : book) {
                if (obj.getBId().equals(bookID)) {
                    ReturnBook= obj;
                    break; // Stop after finding the first match
                }
            }
            if ( ReturnBook!= null) {
                System.out.println("Found object with name: " + foundObject.getTitle() + ", ID: " + foundObject.getBId());
                foundId.returnBook(ReturnBook);
            } else {
                System.out.println("Object not found.");
            }

        } else {
            System.out.println("Object not found.");
        }

    }

    ;


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        UserDisplay v = new UserDisplay();

        v.showBooks();
    }
}
