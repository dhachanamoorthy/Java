package dao;
import model.Rep;
import java.sql.*;
import java.util.ArrayList;
public class RepDao extends MysqlCon{
    public ArrayList<Rep> getReps(){
        ArrayList<Rep> reps=new ArrayList<Rep>();
        try{
            checkInConnection();
            PreparedStatement ps=con.prepareStatement("select * from rep");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Rep rep=new Rep();
                rep.setRepId(rs.getInt("rep_id"));
                rep.setRepName("rep_name");
                rep.setLocation("location");
                reps.add(rep);
            }
        }
        catch (Exception e){
            System.out.println("Error in getting Rep details "+e);
        }
        finally{
            // doCommit();
            checkOutConnection();
            return reps;
        }
    }
}