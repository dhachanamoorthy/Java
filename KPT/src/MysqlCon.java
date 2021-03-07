
import java.sql.*;
class MysqlCon{
    String DB_URL="jdbc:mysql://localhost:3306/kpt";
    String DB_USERNAME="root";
    String DB_PASSWORD="143454";
    Connection con;
    public void connect(){
        try{
            con=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD); 
        }
        catch(Exception e) {
            System.out.println("Error in connecting Database "+e);
        }
    }
    public void close(){
        try{
            con.close();
        }
        catch(Exception e){
            System.out.println("Error in closing Database Connection");
        }
    }
    
   

}
