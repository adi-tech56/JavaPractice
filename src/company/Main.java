package company;


import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static class Column{
        String columnName;
        String columnDataType;

        public Column(String columnName, String columnDataType) {
            this.columnName = columnName;
            this.columnDataType = columnDataType;
        }

        public String getColumnName() {
            return columnName;
        }

        public void setColumnName(String columnName) {
            this.columnName = columnName;
        }

        public String getColumnDataType() {
            return columnDataType;
        }

        public void setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
        }
    }

    public static void main(String[] args) {
        NewSqlite db = new NewSqlite();
        boolean err = true;


        Scanner s = new Scanner(System.in);
        System.out.println("enter the username");
        String name = s.nextLine();
        System.out.println("enter the password");
        String pass = s.nextLine();
        Connection conn = db.connect_to_db("Jdbc", name, pass);

//int enter =1;
//
//        try {
//            Scanner s1 = new Scanner(System.in);
//            System.out.println("Enter the option  1 for create,2 for read,3 for update or 4 for delete");
//            enter = s.nextInt();
//            s.nextLine();
//            err = false;
//        } catch (Exception e) {
//            System.out.println(e + "e");
//        } finally {
//            while (err == true) {
//                try {
//                    Scanner s1 = new Scanner(System.in);
//                    System.out.println("Enter Valid Input");
//                    System.out.println("Enter the option  1 for create,2 for read,3 for update or 4 for delete");
//                    enter = s1.nextInt();
//                    err = false;
//                } catch (Exception er) {
//                    System.out.println(er + "er");
//                }
//
//            }
//
//
//        }
//
// switch (enter){
//     case 1 : {
//         System.out.println("enter the Table name to create");
//         String table_name = s.nextLine();
//                 db.createTable(conn,table_name);
//     }
//     break ;
//     case 2 :{
//         System.out.println("Enter the table name");
//         String table_name = s.nextLine();
////         System.out.println("The columns in the table");
//       ResultSet rs = db.read_column(conn,table_name);
//         System.out.println("enter the number of row to be inserted");
//         int no_rows = s.nextInt();
//
//       try{
//           for (int i = 0 ; i< no_rows;i++){
//               while(rs.next()){
//                   System.out.print("ENTER FOR THE COLUMN data "+rs.getString("COLUMN_NAME")+ "  where ");
//                   System.out.println(rs.getString("DATA_TYPE")+ " ");
//
//           }
//
////Entering the data in database
//           }
//       }catch(Exception e){
//           System.out.println(e);
//       }
//
//
////         for(int i = 0;i<no_rows;i++){
////             System.out.println("Enter the ");
////         }
//         //        db.insert_row(conn,"employee_table","Adi","Cuttack");
//     }
//     break;
// }

        int in = 0;
        List<Column> columns = new ArrayList<>();
        System.out.println("Enter Details for Columns, you want to add in Table.");
        do{
            Scanner s1 = new Scanner(System.in);
            System.out.println("Enter column Name:- ");
            String columnName = s1.nextLine();
            System.out.println("Enter the dataType for Column:-");
            String dataType = s1.nextLine();

            Column column = new Column(columnName, dataType);
            columns.add(column);

            System.out.println("Enter 0 to create table or anyother to continue adding columns");
            in = s.nextInt();
        } while (in != 0);

        db.createTable(conn, "employee_table_"+System.currentTimeMillis(), columns);

        /*
        * while loop
        *   till user inputs 0
        *   take column-> String for column name and ENUM for data type of column
        * Class Column { String columnName, DataType columnDataType }[]
        * */
        db.insert_row(conn, "employee_table", "Adi", "Cuttack");
        db.insert_row(conn, "employee_table", "Adishree", "Cuttack");
        db.read_data(conn, "employee_table");
        db.update_name(conn, "employee_table", "Adi", "Shree");
        db.read_data(conn, "employee_table");
        db.search_by_name(conn, "employee_table", "Shree");
    }

}