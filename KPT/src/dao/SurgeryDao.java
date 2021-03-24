package dao;
import model.Surgery;
import util.*;
import java.sql.*;
public class SurgeryDao extends MysqlCon {
    DateFormatter dateFormat=new DateFormatter();
    public void createSurgery(Surgery surgery){

        try{
            checkInConnection();
            PreparedStatement ps=con.prepareStatement("insert into surgery(surgery_id,hospital_id,surgery_date,surgery_created_date) values(?,?,?,?)");
            ps.setInt(1,surgery.getSurgeryId());
            ps.setInt(2,surgery.getHospitalId());
            ps.setDate(3,surgery.getSurgeryDate());
            ps.setTimestamp(4,surgery.getSurgeryCreatedDate());
            ps.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Failed to Create surgery "+e);
        }
        finally{
            // doCommit();
            checkOutConnection();
        }
    }
    public Surgery getSurgeryDetails(int surgeryId){
        Surgery surgery=new Surgery();
        try{
            checkInConnection();
            PreparedStatement ps=con.prepareStatement("select * from surgery where surgery_id=?");
            ps.setInt(1,surgeryId);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                surgery.setSurgeryId(surgeryId);
                surgery.setHospitalId(rs.getInt("hospital_id"));
                surgery.setSurgeryDate(rs.getDate("surgery_date"));
            }
        }
        catch(SQLException e){
            System.out.println("Failed to get surgery details "+e);
        }
        finally{
            checkOutConnection();
        }
        return surgery;
    }

    public void deleteSurgery(){

    }
}