package model;
public class Payment {
    private int paymentId;
    private int surgeryId;
    private int hospitalId;
    private int repId;
    private int trayId;
    private String trayCheckInTime;
    private String trayCheckOutTime;
    private int totalTime;
    private int repPayout;
    private int kptCommission;
    private String paymentTime;

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
    public void setTrayCheckInTime(String trayCheckInTime){
        this.trayCheckInTime=trayCheckInTime;
    }

    public void setTrayCheckOutTime(String trayCheckOutTime){
        this.trayCheckOutTime=trayCheckOutTime;
    }

    public void setTotalTime(int totalTime){
        this.totalTime=totalTime;
    }

    public int getPaymentID(){
        return paymentId;
    }

    public int getSurgeryID(){
        return surgeryId;
    }

    public int getHospitalID(){
        return hospitalId;
    }
    public int getTrayID(){
        return trayId;
    }
    public int getRepID(){
        return repId;
    }
    public String getTrayCheckInTime(){
        return trayCheckInTime;
    }

    public String getTrayCheckOutTime(){
        return trayCheckOutTime;
    }

    public int getTotalTime(){
        return totalTime;
    }

    public int getRepPayout(){
        return repPayout;
    }

    public int getKptCommission(){
        return kptCommission;
    }

    public String getPaymentTime(){
        return paymentTime;
    }
}
