package service;
import java.sql.*;
public class MysqlCon{
    String DB_URL="jdbc:mysql://localhost:3306/kpt";
    String DB_USERNAME="root";
    String DB_PASSWORD="123";
    Connection con;
    public Connection connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD); 
        }
        catch(Exception e) {
            System.out.println("Error in connecting Database "+e);
        }
        return con;
    }
    public void close(){
        try{
            con.close();
        }
        catch(Exception e){
            System.out.println("Failed to closing Database Connection");
        }
    }
}
