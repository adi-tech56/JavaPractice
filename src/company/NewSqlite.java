package company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class NewSqlite {
    public Connection connect_to_db(String dbname, String user, String passWord) {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/" + dbname;
             conn = DriverManager.getConnection(url, user, passWord);
            if(conn != null){
                System.out.println("Connection established");
            }
            else{
                System.out.println("Not established");
            }

        } catch (Exception e) {
            System.out.println(e);

        }
        return conn;
    }
    public void createTable(Connection conn,String table_name){
        Statement statement;
        try{
            String query = "CREATE TABLE "+table_name+" (emp_id SERIAL,name VARCHAR(200),address VARCHAR(200),PRIMARY KEY(emp_id));";
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("table Created");
        }
        catch(Exception e){
            System.out.println(e);
        };
    }
    public void insert_row(Connection conn,String table_name,String name,String address){
        Statement statement;
        try{
String query = String.format("INSERT INTO %s(name,address) values('%s','%s')",table_name,name,address);
statement = conn.createStatement();
statement.executeUpdate(query);
            System.out.println("row inserted");
        }catch(Exception e){
            System.out.println(e);
        };

    }
    public void read_data(Connection conn,String table_name){
        Statement statement;
        ResultSet rs = null;
        try{
            String query = String.format("SELECT * from %s",table_name);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while(rs.next()){
                System.out.print(rs.getString("emp_id"));
                System.out.print("   ");
                System.out.print(rs.getString("name"));
                System.out.print("   ");
                System.out.println(rs.getString("address"));
            }

        }catch(Exception e){
            System.out.println(e);
        };
    }
    public void update_name(Connection conn,String table_name,String old_name,String new_name){
        Statement statement;
        try{
            String query = String.format("UPDATE %s set name ='%s' where emp_id = 1",table_name,new_name,old_name);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");

        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void serch_by_name(Connection conn,String table_name,String name){
        Statement statement;
        ResultSet rs= null;
        try{
            String query = String.format("SELECT * from %s where name ='%s'",table_name,name);
            statement = conn.createStatement();
             rs = statement.executeQuery(query);
            while(rs.next()){
                System.out.print(rs.getString("emp_id"));
                System.out.print("   ");
                System.out.print(rs.getString("name"));
                System.out.print("   ");
                System.out.println(rs.getString("address"));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
