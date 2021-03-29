package dao;
import model.Hospital;
import java.sql.*;
import java.util.ArrayList;
public class HospitalDao extends MysqlCon{
    public ArrayList<Hospital> getHospitals(){
        ArrayList<Hospital> hospitals=new ArrayList<Hospital>();
        try{
            checkInConnection();
            PreparedStatement ps=con.prepareStatement("select * from hospital");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Hospital hospital=new Hospital();
                hospital.setHospitalId(rs.getInt("hospital_id"));
                hospital.setHospitalName(rs.getString("hospital_name"));
                hospital.setLocation(rs.getString("location"));
                hospitals.add(hospital);
            }
        }
        catch (Exception e){
            System.out.println("Error in getting Hospital details "+e);
        }
        finally{
            checkOutConnection();
            return hospitals;
        }
    }
}