package Exercise.LibraryNew1;
import Exercise.Library.UserDisplay;
import Exercise.LibraryNew;
import Exercise.LibraryNew1.Book.Book;
import Exercise.LibraryNew1.Member.Member;
import Exercise.LibraryNew1.Transaction.TransactionData;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;


public class UserDisplay1 {

    private static List<Book> books = new ArrayList<>();
    private static List<Member> members = new ArrayList<>();
    public static List<TransactionData.IssueTransaction> issuedTransactionList = new ArrayList<>();
    public static List<TransactionData.ReturnTransaction> returnTransactionList = new ArrayList<>();
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
    public List<TransactionData.IssueTransaction> getIssuedTransactionList() {
        return issuedTransactionList;
    }

    public void setIssuedTransactionList(List<TransactionData.IssueTransaction> issuedTransactionList) {
        this.issuedTransactionList = issuedTransactionList;
    }

    public List<TransactionData.ReturnTransaction> getReturnTransactionList() {
        return returnTransactionList;
    }
    public void setReturnTransactionList(List<TransactionData.ReturnTransaction> returnTransactionList) {
        this.returnTransactionList = returnTransactionList;
    }
    private static void setMembers(UserDisplay1 libraryNew) {
        List<Member> members = libraryNew.getMembers();
        String memberIdString = "M";
        String memberNameString = "Member";
        for (int i = 1; i <= 10; i++) {
            List<Book> empltyList = new ArrayList<>();
            Member member = new Member(memberIdString + i, memberNameString + i, empltyList);
            members.add(member);
        }
    }

    private static void setBooks(UserDisplay1 libraryNew) {
        List<Book> books = libraryNew.getBooks();
        String bookIdString = "B";
        String bookTitleString = "Book";
        String authorNameString = "Author";
        for (int i = 1; i <= 100; i++) {
            Book book = new Book(bookIdString + i, bookTitleString + i, authorNameString + i, null);
            books.add(book);
        }
    }
    private static void startLibrary(UserDisplay1 libraryNew) {
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

                    String memberId = null;
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
//                        int enter1= 1 ;
                        String enter1 = null;
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
                                        System.out.println("Enter 1 for Issue, 2 for Return, 3to show borrowed books and 0 to exit");
                                        enter1 = s1.nextLine();
                                        err2 = false;
                                    } catch (Exception er) {
                                        System.out.println(er + "er");
                                    }

                                }
                            }
                            String finalEnter1= enter1;


                            if (finalEnter1.equals("I")) {
                                bookIssue(member);
                            } else if (finalEnter1.equals("R")) {
                                bookReturn(member);
                            } else if (finalEnter1.equals("B")) {
                                showBorrowedBooks(member);
                            } else if (!finalEnter1.equals("E")) {
                                System.out.println("enter the valid input");
                            }

                        } while (!enter1.equals("E"));
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
        books.stream().filter(book -> book.possesionWithMemeberId == member.getMemberId()).forEach(System.out::println);
        Stream<Book> bookList = books.stream().filter(book -> book.possesionWithMemeberId == member.getMemberId());
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

    private static void showData(UserDisplay1 libraryNew) {
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
        for (TransactionData.IssueTransaction transaction : issuedTransactionList) {
            System.out.println(transaction);
        }
        System.out.println("List of Return Transactions  : ->");
        for (TransactionData.ReturnTransaction transaction : returnTransactionList) {
            System.out.println(transaction);
        }
    }

    public static void main(String[] args) {

        UserDisplay1 libraryNew = new UserDisplay1();
        setBooks(libraryNew);
        setMembers(libraryNew);
//        showData(libraryNew);
        startLibrary(libraryNew);

    }
}
