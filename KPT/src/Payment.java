class Payment {
    private int payment_id;
    private int surgery_id;
    private int hospital_id;
    private int rep_id;
    private int tray_id;
    private String tray_check_in_time;
    private String tray_check_out_time;
    private int total_time;
    private int rep_payout;
    private int kpt_commission;
    private String payment_time;

    public void setSurgeryId(int surgery_id){
        this.surgery_id=surgery_id;
    }
    public void setHospitalId(int hospital_id){
        this.hospital_id=hospital_id;
    }
    public void setRepId(int rep_id){
        this.rep_id=rep_id;
    }
    public void setTrayId(int tray_id){
        this.tray_id=tray_id;
    }
    public void setTrayCheckInTime(String tray_check_in_time){
        this.tray_check_in_time=tray_check_in_time;
    }

    public void setTrayCheckOutTime(String tray_check_out_time){
        this.tray_check_out_time=tray_check_out_time;
    }

    public void setTotalTime(int total_time){
        this.total_time=total_time;
    }

    public int getPaymentID(){
        return payment_id;
    }

    public int getSurgeryID(){
        return surgery_id;
    }

    public int getHospitalID(){
        return hospital_id;
    }
    public int getTrayID(){
        return tray_id;
    }
    public int getRepID(){
        return rep_id;
    }
    public String getTrayCheckInTime(){
        return tray_check_in_time;
    }

    public String getTrayCheckOutTime(){
        return tray_check_out_time;
    }

    public int getTotalTime(){
        return total_time;
    }

    public int getRepPayout(){
        return rep_payout;
    }

    public int getKptCommission(){
        return kpt_commission;
    }

    public String getPaymentTime(){
        return payment_time;
    }
}
