package model;
public class Surgery {
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
    public String getSurgeryDate(){
        return surgeryDate;
    }
}
