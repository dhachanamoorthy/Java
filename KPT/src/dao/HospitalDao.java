package dao;
import model.Tray;
import java.sql.*;
public class HospitalDao extends MysqlCon{
    public void getHospitals(){
        ArrayList<Hospital> hospitals=new ArrayList<Hospital>();
        try{
            checkInConnection();
            PreparedStatement ps=con.prepareStatement("select * from hospital");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Hospital hospital=new Hospital();
                hospital.setHospitalId(rs.getInt("hospital_id"));
                hospital.setHospitalName(rs.getString("hospital_name"));
                hospital.setHospitalLocation(rs.getString("location"));
                hospitals.add(hospital);
            }
        }
        catch (Exception e){
            System.out.println("Error in getting Hospital details "+e);
        }
        finally{
            // doCommit();
            checkOutConnection();
            return hospitals;
        }
    }
}