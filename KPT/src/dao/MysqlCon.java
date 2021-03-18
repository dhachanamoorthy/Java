package dao;
import java.sql.*;
public class MysqlCon {
    private String DB_URL="jdbc:mysql://localhost:3306/kpt";
    private String DB_USERNAME="root";
    private String DB_PASSWORD="123";
    protected Connection con;
    public Connection checkInConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD); 
        }
        catch(Exception e) {
            System.out.println("Error in connecting Database "+e);
        }
        return con;
    }
    public void checkOutConnection(){
        try{
            con.close();
        }
        catch(Exception e){
            System.out.println("Failed to closing Database Connection");
        }
    }
    public void doCommit(){
        try{
            con.commit();
        }
        catch(Exception e){
            System.out.println("Failed to commit "+e);
        }
    }
}
