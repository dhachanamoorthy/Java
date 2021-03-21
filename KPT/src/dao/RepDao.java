package dao;
import model.Tray;
import java.sql.*;
public class RepDao extends MysqlCon{
    public void getReps(){
        ArrayList<Rep> reps=new ArrayList<Rep>();
        try{
            checkInConnection();
            PreparedStatement ps=con.prepareStatement("select * from rep");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Rep rep=new Rep();
                rep.setRepId(rs.getInt("rep_id"));
                rep.se("rep_name");
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