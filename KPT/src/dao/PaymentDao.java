package dao;
import model.Payment;
import java.sql.*;
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
    public int yearlyTrayUsage(int hospitalId){
        int traysUsed=0;
        try{
            checkInConnection();
            PreparedStatement ps=con.prepareStatement("select hospital_id from payment WHERE hospital_id=? && year(payment_date) = YEAR(CURDATE());");
            ps.setInt(1,hospitalId);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                traysUsed++;
            }
        }
        catch (Exception e){
            throw e;
        }
        finally{
            // doCommit();
            checkOutConnection();
            return traysUsed;
        }
    }
    public int yearlyRepPayout(int repId){
        int repPayout=0;
        try{
            checkInConnection();
            PreparedStatement ps=con.prepareStatement("select rep_payout from payment WHERE rep_id=? && year(payment_date) = YEAR(CURDATE());");
            ps.setInt(1,repId);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                repPayout+=rs.getInt("rep_payout");
            }
        }
        catch (Exception e){
            throw e;
        }
        finally{
            // doCommit();
            checkOutConnection();
            return repPayout;
        }
    }
    public int yearlyKPTCommission(){
        int totalCommission=0;
        try{
            checkInConnection();
            PreparedStatement ps=con.prepareStatement("select kpt_commission from payment WHERE year(payment_date) = YEAR(CURDATE());");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                totalCommission+=rs.getInt("kpt_commission");
            }
        }
        catch (Exception e){
            throw e;
        }
        finally{
            // doCommit();
            checkOutConnection();
            return totalCommission;
        }
    }
    public int monthlyTrayUsage(int hospitalId){
        int traysUsed=0;
        try{
            checkInConnection();
            PreparedStatement ps=con.prepareStatement("select hospital_id from payment WHERE hospital_id=? && year(payment_date) = YEAR(CURDATE()) && MONTH(payment_date) = MONTH(CURRENT_DATE())");
            ps.setInt(1,hospitalId);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                traysUsed++;
            }
        }
        catch (Exception e){
            throw e;
        }
        finally{
            // doCommit();
            checkOutConnection();
            return traysUsed;
        }
    }
    public int monthlyRepPayout(int repId){
        int repPayout=0;
        try{
            checkInConnection();
            PreparedStatement ps=con.prepareStatement("select rep_payout from payment WHERE rep_id=? && year(payment_date) = YEAR(CURDATE()) && MONTH(payment_date) = MONTH(CURRENT_DATE());");
            ps.setInt(1,repId);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                repPayout+=rs.getInt("rep_payout");
            }
        }
        catch (Exception e){
            throw e;
        }
        finally{
            // doCommit();
            checkOutConnection();
            return repPayout;
        }
    }
    public int monthlyKPTCommission(){
        int totalCommission=0;
        try{
            checkInConnection();
            PreparedStatement ps=con.prepareStatement("select kpt_commission from payment WHERE year(payment_date) = YEAR(CURDATE()) && MONTH(payment_date) = MONTH(CURRENT_DATE());");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                totalCommission+=rs.getInt("kpt_commission");
            }
        }
        catch (Exception e){
            throw e;
        }
        finally{
            // doCommit();
            checkOutConnection();
            return totalCommission;
        }
    }
}
