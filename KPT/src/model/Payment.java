package model;
import java.sql.Timestamp;
public class Payment {
    private int paymentId;
    private int surgeryId;
    private int hospitalId;
    private int repId;
    private int trayId;
    private int eventId;
    private Timestamp trayCheckInTime;
    private Timestamp trayCheckOutTime;
    private int trayUsed;
    private int repPayout;
    private int kptCommission;
    private Timestamp paymentTime;

    public void setSurgeryId(int surgeryId){
        this.surgeryId=surgeryId;
    }
    public void setHospitalId(int hospitalId){
        this.hospitalId=hospitalId;
    }
    public void setRepId(int repId){
        this.repId=repId;
    }
    public void setTrayId(int trayId){
        this.trayId=trayId;
    }

    public void setEventId(int eventId){
        this.eventId=eventId;
    }

    public void setTrayCheckInTime(Timestamp trayCheckInTime){
        this.trayCheckInTime=trayCheckInTime;
    }

    public void setTrayCheckOutTime(Timestamp trayCheckOutTime){
        this.trayCheckOutTime=trayCheckOutTime;
    }

    public void setTrayUsage(int trayUsed){
        this.trayUsed=trayUsed;
    }

    public void setRepPayout(int repPayout){
        this.repPayout=repPayout;
    }

    public void setKptCommission(int kptCommission){
        this.kptCommission=kptCommission;
    }

    public void setPaymentTime(Timestamp paymentTime){
        this.paymentTime=paymentTime;
    }

    public int getPaymentId(){
        return paymentId;
    }

    public int getSurgeryId(){
        return surgeryId;
    }

    public int getHospitalId(){
        return hospitalId;
    }
    public int getTrayId(){
        return trayId;
    }
    public int getRepId(){
        return repId;
    }

    public int getEventId(){
        return eventId;
    }

    public Timestamp getTrayCheckInTime(){
        return trayCheckInTime;
    }

    public Timestamp getTrayCheckOutTime(){
        return trayCheckOutTime;
    }

    public int getTrayUsage(){
        return trayUsed;
    }

    public int getRepPayout(){
        return repPayout;
    }

    public int getKptCommission(){
        return kptCommission;
    }

    public Timestamp getPaymentTime(){
        return paymentTime;
    }
}
