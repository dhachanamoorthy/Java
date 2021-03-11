package dao;
import model.Surgery;
import service.MysqlCon;
import java.sql.*;
public class SurgeryDao extends MysqlCon{
    public void insertSurgeryData(Surgery surgery){
        try{
            checkInConnection();
            PreparedStatement ps=con.prepareStatement("insert into surgery(hospital_id,surgery_date,surgery_created_date) values(?,?,?)");
            ps.setInt(1,surgery.getHospitalId());
            ps.setString(2,surgery.getSurgeryDate());
            ps.setString(3,surgery.getSurgeryCreatedDate());
            System.out.println(ps.executeUpdate()); 
            checkOutConnection();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public Surgery getSurgeryData(int surgeryId){
        Surgery surgery=new Surgery();
        try{
            checkInConnection();
            PreparedStatement ps=con.prepareStatement("select * from surgery where surgery_id=?");
            ps.setInt(1,surgeryId);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                surgery.setSurgeryId(surgeryId);
                surgery.setHospitalId(rs.getInt("hospital_id"));
                surgery.setSurgeryDate(rs.getString("surgery_date"));
            }
            checkOutConnection();
            
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        return surgery;
    }
}