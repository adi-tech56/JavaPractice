package company;


import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NewSqlite db = new NewSqlite();
        Scanner s = new Scanner(System.in);
        System.out.println("enter the username");
        String name = s.nextLine();
        System.out.println("enter the password");
        String pass = s.nextLine();
        Connection conn= db.connect_to_db("Jdbc",name,pass);
        System.out.println("Enter the option  1 for create,2 for update,3 for read or 4 for delete");

//        db.createTable(conn,"employee_table");
//        db.insert_row(conn,"employee_table","Adi","Cuttack");
//        db.insert_row(conn,"employee_table","Adishree","Cuttack");
//        db.read_data(conn,"employee_table");
//        db.update_name(conn,"employee_table","Adi","Shree");
//        db.read_data(conn,"employee_table");
        db.serch_by_name(conn,"employee_table","Shree");
    }

}