package dao;
import model.Payment;
import java.sql.*;
import java.util.ArrayList;
public class PaymentDao extends MysqlCon{
    public void doPayment(Payment payment){
        try{
            checkInConnection();
            PreparedStatement ps=con.prepareStatement("insert into payment(hospital_id,rep_id,surgery_id,tray_id,event_id,tray_check_in_time,tray_check_out_time,tray_used,rep_payout,kpt_commission,payment_date) values(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1,payment.getHospitalId());
            ps.setInt(2,payment.getRepId());
            ps.setInt(3,payment.getSurgeryId());
            ps.setInt(4,payment.getTrayId());
            ps.setInt(5,payment.getEventId());
            ps.setTimestamp(6,payment.getTrayCheckInTime());
            ps.setTimestamp(7,payment.getTrayCheckOutTime());
            ps.setInt(8,payment.getTrayUsage());
            ps.setInt(9,payment.getRepPayout());
            ps.setInt(10,payment.getKptCommission());
            ps.setTimestamp(11,payment.getPaymentTime());
            ps.executeUpdate();
        }
        catch (Exception e){
           e.printStackTrace();
        }
        finally{
            // doCommit();
            checkOutConnection();
        }
    }
    public ArrayList<String> yearlyTrayUsage(){
        ArrayList<String> resultSet=new ArrayList<String>();
        try{
            checkInConnection();
            String sql="select hospital.hospital_id,hospital.hospital_name,count(payment.tray_id) as traysUsed,"
                        +"year(payment_date) as year from hospital left join payment on "
                        +"hospital.hospital_id=payment.hospital_id group by hospital_id,year(payment.payment_date);";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                int hospitalId=rs.getInt("hospital_id");
                String hospitalName=rs.getString("hospital_name");
                int traysUsed=rs.getInt("traysUsed");
                int year =rs.getInt("year");
                String result=Integer.toString(hospitalId)+","
                                +hospitalName+","
                                +Integer.toString(traysUsed)+","
                                +Integer.toString(year);
                resultSet.add(result);
            }
        }
        catch (Exception e){
            throw e;
        }
        finally{
            checkOutConnection();
            return resultSet;
        }
    }
    public ArrayList<String> yearlyRepPayout(){
        ArrayList<String> resultSet=new ArrayList<String>();
        try{
            checkInConnection();
            String sql="select rep.rep_id ,rep.rep_name ,sum(payment.rep_payout) as total_payout,"
                        +"year(payment.payment_date) as year "
                        +"from rep left join payment on rep.rep_id=payment.rep_id group by rep_id, "
                        +"year(payment.payment_date);";               
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                int repId=rs.getInt("rep_id");
                String repName=rs.getString("rep_name");
                int repPayout=rs.getInt("total_payout");
                int year=rs.getInt("year");
                String result=Integer.toString(repId)+","
                                +repName+","
                                +Integer.toString(repPayout)+","
                                +Integer.toString(year);
                resultSet.add(result);
            }
        }
        catch (Exception e){
            throw e;
        }
        finally{
            checkOutConnection();
            return resultSet;
        }
    }
    public ArrayList<String> yearlyKPTCommission(){
        ArrayList<String> resultSet=new ArrayList<String>();
        try{
            checkInConnection();
            String sql="select sum(kpt_commission) as commission,"
                        +"year(payment_date) as year from payment group by "
                        +"year(payment_date)"; 
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                int commission=rs.getInt("commission");
                int year=rs.getInt("year");
                String result=Integer.toString(commission)+","
                                +Integer.toString(year);
                resultSet.add(result);
            }
        }
        catch (Exception e){
            throw e;
        }
        finally{
            checkOutConnection();
            return resultSet;
        }
    }
    public ArrayList<String> monthlyTrayUsage(){
        ArrayList<String> hospitalReport=new ArrayList<String>();
        try{
            checkInConnection();
            String sql="select hospital.hospital_id,hospital.hospital_name,count(payment.tray_id) as traysUsed,"
                        +"month(payment.payment_date) as month,year(payment_date) as year from hospital "
                        +"left join payment on hospital.hospital_id=payment.hospital_id group by hospital_id,"
                        +"Month(payment.payment_date),year(payment.payment_date);";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                int hospitalId=rs.getInt("hospital_id");
                String hospitalName=rs.getString("hospital_name");
                int traysUsed=rs.getInt("traysUsed");
                int month=rs.getInt("month");
                int year =rs.getInt("year");
                String result=Integer.toString(hospitalId)+","
                                +hospitalName+","
                                +Integer.toString(traysUsed)+","
                                +Integer.toString(month)+"/"
                                +Integer.toString(year);
                hospitalReport.add(result);
            }
        }
        catch (Exception e){
            throw e;
        }
        finally{
            checkOutConnection();
            return hospitalReport;
        }
    }
    public ArrayList<String> monthlyRepPayout(){
        ArrayList<String> resultSet=new ArrayList<String>();
        try{
            checkInConnection();
            String sql="select rep.rep_id ,rep.rep_name ,sum(payment.rep_payout) as total_payout,"
                        +"month(payment.payment_date) as month ,year(payment.payment_date) as year "
                        +"from rep  left join payment on rep.rep_id=payment.rep_id group by rep_id, "
                        +"Month(payment.payment_date),year(payment.payment_date);";                
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                int repId=rs.getInt("rep_id");
                String repName=rs.getString("rep_name");
                int repPayout=rs.getInt("total_payout");
                int month=rs.getInt("month");
                int year=rs.getInt("year");
                String result=Integer.toString(repId)+","
                                +repName+","
                                +Integer.toString(repPayout)+","
                                +Integer.toString(month)+"/"
                                +Integer.toString(year);
                resultSet.add(result);
            }
        }
        catch (Exception e){
            throw e;
        }
        finally{
            checkOutConnection();
            return resultSet;
        }
    }
    public ArrayList<String> monthlyKPTCommission(){
        ArrayList<String> resultSet=new ArrayList<String>();
        try{
            checkInConnection();
            String sql="select sum(kpt_commission) as commission,month(payment_date) as month,"
                        +"year(payment_date) as year from payment group by Month(payment_date),"
                        +"year(payment_date)"; 
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                int commission=rs.getInt("commission");
                int month=rs.getInt("month");
                int year=rs.getInt("year");
                String result=Integer.toString(commission)+","
                                +Integer.toString(month)+"/"
                                +Integer.toString(year);
                resultSet.add(result);
            }
        }
        catch (Exception e){
            throw e;
        }
        finally{
            checkOutConnection();
            return resultSet;
        }
    }
}
