package model;
public class SurgeryTrayInfo{
    private int surgeryId;
    private int trayId;

    public void setTrayId(int trayId){
        this.trayId=trayId;
    }

    public void setSurgeryId(int surgeryId){
        this.surgeryId=surgeryId;
    }

    public int getTrayId(){
        return trayId;
    }

    public void getSurgeryId(){
        return surgeryId;
    }
}