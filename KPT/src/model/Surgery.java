package model;
class Surgery {
    private int surgeryId;
    private int hospitalId;
    private int repId;
    private int trayId;
    private String surgeryDate;
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
    public void setSurgeryDate(String surgeryDate){
        this.surgeryDate=surgeryDate;
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
    public String getSurgeryDate(){
        return surgeryDate;
    }
}
