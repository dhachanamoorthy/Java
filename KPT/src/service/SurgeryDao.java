package service;
import model.Surgery;
import java.sql.*;
public class SurgeryDao{
    MysqlCon db=new MysqlCon();
    Connection con=null;
    public void insertSurgeryData(Surgery surgery){
        try{
            con=db.connect();
            PreparedStatement ps=con.prepareStatement("insert into surgery(hospital_id,tray_id,surgery_date) values(?,?,?)");
            ps.setInt(1,surgery.getHospitalId());
            ps.setInt(2,surgery.getTrayId());
            ps.setString(3,surgery.getSurgeryDate());
            System.out.println(ps.executeUpdate()); 
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public Surgery getSurgeryData(int surgeryId){
        Surgery surgery=new Surgery();
        try{
            con=db.connect();
            PreparedStatement ps=con.prepareStatement("select 8 from surgery where surgery_id=?");
            ps.setInt(1,surgeryId);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                surgery.setSurgeryId(surgeryId);
                surgery.setHospitalId(rs.getInt("hospital_id"));
                surgery.setTrayId(rs.getInt("tray_id"));
                surgery.setSurgeryDate(rs.getString("surgery_date"));
            }
            con.close();
            
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        return surgery;
    }
}