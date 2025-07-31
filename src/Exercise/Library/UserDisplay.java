package Exercise.Library;

import Exercise.Library.Books.Book;
import Exercise.Library.Members.Member;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

public class UserDisplay {

    void showBooks(){
        ArrayList<Book> libraryBooks =new ArrayList<>();
        Book book1 = new Book("101", "The Great Gatsby", "F. Scott Fitzgerald","ISBN101");
        Book book2 = new Book("102", "To Kill a Mockingbird", "Harper Lee","ISBN102");
        Book book3 = new Book("103", "Little Woman", "Harper Lee","ISBN103");
        // Add Book objects to the ArrayList
        libraryBooks.add(book1);
        libraryBooks.add(book2);
        libraryBooks.add(book3);
        for (Book book : libraryBooks) {
            System.out.println(book);
        }
        ArrayList<Member> members =new ArrayList<>();
        Member m1 = new Member("Ram","01");
        Member m2= new Member("Sam","02");
        String searchName ="101";
        Book foundObject = null;
        for (Book obj : libraryBooks) {
            if (obj.getBId().equals(searchName)) {
                foundObject = obj;
                break; // Stop after finding the first match
            }
        }
        if (foundObject != null) {
            System.out.println("Found object with name: " + foundObject.getTitle() + ", ID: " + foundObject.getBId());
            m2.borrowBook(foundObject);
        } else {
            System.out.println("Object not found.");
        }
        members.add(m1);
        members.add(m2);

        for (Member member : members) {
            System.out.println(member);
        }

    };


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        UserDisplay v = new UserDisplay();
        System.out.println("Available book List");
        v.showBooks();

    }
}
