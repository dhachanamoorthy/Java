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
            if(ps.executeUpdate()==1){
                System.out.println("Payment of Rs."+payment.getRepPayout()+" has transfered successfully to "+payment.getRepId()+" by "+payment.getHospitalId());
            }
        }
        catch (Exception e){
            System.out.println("Error in while doing payment "+e);
        }
        finally{
            // doCommit();
            checkOutConnection();
        }
    }
    public int yearlyTrayUsage(int hospital_id){
        int traysUsed=0;
        try{
            checkInConnection();
            PreparedStatement ps=con.prepareStatement("select * from payments WHERE hospital_id=? && year(payment_date) = YEAR(CURDATE());";
            ps.setInt(1,hospital_id);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                traysUsed++;
            }
    }
    catch (Exception e){
        System.out.println("Error in while getting hospital tray usage "+e);
    }
    finally{
        // doCommit();
        checkOutConnection();
        return traysUsed;
    }
    
    public int yearlyRepPayout(int rep_id){
        int repPayout=0;
        try{
            checkInConnection();
            PreparedStatement ps=con.prepareStatement("select * from payments WHERE rep_id=? && year(payment_date) = YEAR(CURDATE());";
            ps.setInt(1,rep_id);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                repPayout+=rs.getInt('rep_payout');
            }
    }
    catch (Exception e){
        System.out.println("Error in while getting yearly rep payout "+e);
    }
    finally{
        // doCommit();
        checkOutConnection();
        return repPayout;
    }
}
