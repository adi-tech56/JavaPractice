package company;


import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        NewSqlite db = new NewSqlite();
       Connection conn= db.connect_to_db("Jdbc","postgres","argusadmin");
//        db.createTable(conn,"employee_table");
//        db.insert_row(conn,"employee_table","Adi","Cuttack");
//        db.insert_row(conn,"employee_table","Adishree","Cuttack");
        db.read_data(conn,"employee_table");
    }

}