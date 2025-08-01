package Exercise;

import java.util.*;
import java.util.stream.Stream;

public class LibraryNew {


    private static List<Book> books = new ArrayList<>();
    private static List<Member> members = new ArrayList<>();
    public static List<IssueTransaction> issuedTransactionList = new ArrayList<>();
    public static List<ReturnTransaction> returnTransactionList = new ArrayList<>();


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<IssueTransaction> getIssuedTransactionList() {
        return issuedTransactionList;
    }

    public void setIssuedTransactionList(List<IssueTransaction> issuedTransactionList) {
        this.issuedTransactionList = issuedTransactionList;
    }

    public List<ReturnTransaction> getReturnTransactionList() {
        return returnTransactionList;
    }

    public void setReturnTransactionList(List<ReturnTransaction> returnTransactionList) {
        this.returnTransactionList = returnTransactionList;
    }

    public static class Book {
        private String bookId;
        private String name;
        private String author;
        private String possesionWithMemeberId;

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
                IssueTransaction issueTransaction = new IssueTransaction(System.currentTimeMillis(), bookId, memberId, new Date());
                issuedTransactionList.add(issueTransaction);
                return true;
            }
            return false;
        }

        public boolean returnBook(String memberId) {
            if (possesionWithMemeberId != null) {
                this.possesionWithMemeberId = null;
                ReturnTransaction returnTransaction = new ReturnTransaction(System.currentTimeMillis(), bookId, memberId, new Date());
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

    public static class Member {

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

    public static class Transaction {
        private Long id;
        private String bookId;
        private String memberId;

        public Transaction(Long id, String bookId, String memberId) {
            this.id = id;
            this.bookId = bookId;
            this.memberId = memberId;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getBookId() {
            return bookId;
        }

        public void setBookId(String bookId) {
            this.bookId = bookId;
        }

        public String getMemberId() {
            return memberId;
        }

        public void setMemberId(String memberId) {
            this.memberId = memberId;
        }

    }

    public static class IssueTransaction extends Transaction {
        private Date time;

        public IssueTransaction(Long id, String bookId, String memberId, Date time) {
            super(id, bookId, memberId);
            this.time = time;
        }

        public Date getTime() {
            return time;
        }

        public void setTime(Date time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "IssueTransaction{" +
                    "time=" + time +
                    ", id=" + super.id +
                    ", bookId='" + super.bookId + '\'' +
                    ", memberId='" + super.memberId + '\'' +
                    '}';
        }
    }

    public static class ReturnTransaction extends Transaction {
        private Date time;

        public ReturnTransaction(Long id, String bookId, String memberId, Date time) {
            super(id, bookId, memberId);
            this.time = time;
        }

        public Date getTime() {
            return time;
        }

        public void setTime(Date time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "ReturnTransaction{" +
                    "time=" + time +
                    ", id=" + super.id +
                    ", bookId='" + super.bookId + '\'' +
                    ", memberId='" + super.memberId + '\'' +
                    '}';
        }
    }


    public static void main(String[] args) {

        LibraryNew libraryNew = new LibraryNew();
        setBooks(libraryNew);
        setMembers(libraryNew);
//        showData(libraryNew);
        startLibrary(libraryNew);

    }

    private static void startLibrary(LibraryNew libraryNew) {
        int enter = 1;
        while (enter != 0) {
            boolean err = true;


            try {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter 1 to show Overall or 2 for UserId or 0 to exit");
                enter = s.nextInt();
                s.nextLine();
                err = false;
            } catch (Exception e) {
                System.out.println(e + "e");
            } finally {
                while (err == true) {
                    try {
                        Scanner s1 = new Scanner(System.in);
                        System.out.println("Enter Valid Input");
                        System.out.println("Enter 1 to show Overall or 2 for UserId or 0 to exit");
                        enter = s1.nextInt();
                        err = false;
                    } catch (Exception er) {
                        System.out.println(er + "er");
                    }

                }


            }


            System.out.println(enter);

            switch (enter) {
                case 0: {
                    System.exit(0);
                }
                case 1: {
                    showData(libraryNew);
                    // if overall then show borrowedList and bookIssue/return transactions
                }
                break;
                case 2: {
                    // if user specific
                    boolean err1 = true;
//                    Scanner s1 = new Scanner(System.in);
                    String memberId = null;
//                    try {
//                        System.out.println("Enter your MemberId");
//                        memberId = s1.nextLine();
//                    } catch (Exception e) {
//                        System.out.println("Enter valid Id");
//                        System.out.println("Enter your MemberId");
//                        memberId = s1.nextLine();
//                    }
                    try {
                        Scanner s = new Scanner(System.in);
                        System.out.println("Enter your MemberId");
                        memberId = s.nextLine();

                        err1 = false;
                    } catch (Exception e) {
                        System.out.println(e + "e");
                    } finally {
                        while (err1 == true) {
                            try {
                                Scanner s1 = new Scanner(System.in);
                                System.out.println("Enter your MemberId");
                                memberId = s1.nextLine();

                                err1 = false;
                            } catch (Exception er) {
                                System.out.println(er + "er");
                            }

                        }


                    }

                    String finalMemberId = memberId;
                    Optional<Member> foundMemberOptional = members.stream().filter(m -> m.getMemberId().equals(finalMemberId)).findFirst();

                    if (foundMemberOptional.isPresent()) {
                        Member member = foundMemberOptional.get();
                        System.out.println("Member with Id: " + member.getMemberId() + ", ID: " + member.getName());
                        String enter1 = "I";
                        do {

                            boolean err2 = true;
                            try {
                                Scanner s1 = new Scanner(System.in);
                                System.out.println("Enter I for Issue, R for Return, B to show borrowed books and E to exit");
                                enter1 = s1.nextLine();
                                err2 = false;
                            } catch (Exception e) {
                                System.out.println(e + "e");
                            } finally {
                                while (err2 == true) {
                                    try {
                                        Scanner s1 = new Scanner(System.in);
                                        System.out.println("Enter I for Issue, R for Return, B to show borrowed books and E to exit");
                                        enter1 = s1.nextLine();
                                        err2 = false;
                                    } catch (Exception er) {
                                        System.out.println(er + "er");
                                    }

                                }


                            }
//                            System.out.println("Enter I for Issue, R for Return, B to show borrowed books and E to exit");
//                            enter1 = s1.nextLine();

                            if (enter1 == "I") {
                                bookIssue(member);
                            } else if (enter1 == "R") {
                                bookReturn(member);
                            } else if (enter1 == "B") {
                                showBorrowedBooks(member);
                            } else if (enter1 != "E") {
                                System.out.println("enter the valid input");
                            }
                        } while (enter1 != "E");
                    } else {
                        System.out.println("Member does not exist!");
                    }
                }
                break;

                default: {
                    System.out.println("Enter the Valid Input");
                }
            }


        }


        // check validity of user
        // ask user for action -> show account/ return / bookIssue

        // if return -> show borrowed books then ask bookId and validate bookId and return trans
        // if show -> display

    }

    private static void showBorrowedBooks(Member member) {
        member.getBorrowedBooks().stream().filter(book -> book.possesionWithMemeberId != null).forEach(System.out::println);
    }

    private static void bookIssue(Member member) {
        System.out.println("Available books to Issue");
        books.stream().filter(book -> book.possesionWithMemeberId == null).forEach(System.out::println);
        Stream<Book> bookList = books.stream().filter(book -> book.possesionWithMemeberId == null);
        System.out.println("Enter the book id to bookIssue");
        Scanner s2 = new Scanner(System.in);
        String bookId = s2.nextLine();

        Optional<Book> foundBookOptional = bookList.filter(b -> b.getBookId().equals(bookId)).findFirst();

        if (foundBookOptional.isPresent()) {
            Book foundBook = foundBookOptional.get();
            System.out.println("Found object with name: " + foundBook.getName() + ", ID: " + foundBook.getBookId());
            member.borrowBook(foundBook);
        } else {
            System.out.println("Object not found.");
        }
        System.out.println("Here is the list of books borrowed by you : ");
        System.out.println(member.getBorrowedBooks());
    }

    private static void bookReturn(Member member) {
        System.out.println("Available books to return");
        books.stream().filter(book -> book.possesionWithMemeberId == member.memberId).forEach(System.out::println);
        Stream<Book> bookList = books.stream().filter(book -> book.possesionWithMemeberId == member.memberId);
        System.out.println("Enter the book id to return");
        Scanner s3 = new Scanner(System.in);
        String bookId = s3.nextLine();
        Optional<Book> foundBookOptional = bookList.filter(b -> b.getBookId().equals(bookId)).findFirst();

        if (foundBookOptional.isPresent()) {
            Book foundBook = foundBookOptional.get();
            System.out.println("Found object with name: " + foundBook.getName() + ", ID: " + foundBook.getBookId());
            member.returnBook(foundBook);
        } else {
            System.out.println("Object not found.");
        }
        System.out.println("Here is the list after returning the book : ");
        System.out.println(member.getBorrowedBooks());
    }

    private static void showData(LibraryNew libraryNew) {
        List<Book> bookList = libraryNew.getBooks();

        System.out.println("List of Books : ->");

        for (Book book : bookList) {
            System.out.println(book);
        }

        System.out.println("List of Members : ->");

        for (Member member : libraryNew.getMembers()) {
            System.out.println(member);
        }

        System.out.println("List of Issue Transactions  : ->");
        for (Transaction transaction : issuedTransactionList) {
            System.out.println(transaction);
        }
        System.out.println("List of Return Transactions  : ->");
        for (Transaction transaction : returnTransactionList) {
            System.out.println(transaction);
        }
    }

    private static void setMembers(LibraryNew libraryNew) {
        List<Member> members = libraryNew.getMembers();
        String memberIdString = "M";
        String memberNameString = "Member";
        for (int i = 1; i <= 10; i++) {
            List<Book> empltyList = new ArrayList<>();
            Member member = new Member(memberIdString + i, memberNameString + i, empltyList);
            members.add(member);
        }
    }

    private static void setBooks(LibraryNew libraryNew) {
        List<Book> books = libraryNew.getBooks();
        String bookIdString = "B";
        String bookTitleString = "Book";
        String authorNameString = "Author";
        for (int i = 1; i <= 100; i++) {
            Book book = new Book(bookIdString + i, bookTitleString + i, authorNameString + i, null);
            books.add(book);
        }
    }

}
