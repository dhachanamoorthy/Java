package dao;
import model.Tray;
import java.sql.*;
public class TrayDao extends MysqlCon{
        public Tray getTrayDetails(int trayId){
            Tray tray=new Tray();
            try{
                checkInConnection(); 
                PreparedStatement ps=con.prepareStatement("select * from tray where tray_id=?");
                ps.setInt(1,trayId);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    tray.setTrayId(trayId);
                    tray.setRepId(rs.getInt("rep_id"));
                    tray.setChargesPerDay(rs.getInt("charges_per_day"));
                }
            }
            catch(SQLException e){
                System.out.println("Failed to get tray details "+e);
            }
            finally{
                checkOutConnection();
                return tray;
            }
        }
}