package model;
import java.util.*;
public class Surgery {
    private int surgeryId;
    private int hospitalId;
    private int repId;
    private String surgeryCreatedDate;
    private  ArrayList<Tray> trayList;   
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
    public void setTrayId(ArrayList<Tray> trayList){
        this.trayList=new ArrayList<Tray>();
        Collections.copy(this.trayList,trayList);
    }
    public void setSurgeryDate(String surgeryDate){
        this.surgeryDate=surgeryDate;
    }
    public void setSurgeryCreatedDate(String surgeryCreatedDate){
        this.surgeryCreatedDate=surgeryCreatedDate;
    }
    public int getSurgeryId(){
        return surgeryId;
    }
    public int getHospitalId(){
        return hospitalId;
    }
    public ArrayList<Tray> getTrayId(){
        return trayList;
    }
    public int getRepId(){
        return repId;
    }
    public String getSurgeryDate(){
        return surgeryDate;
    }
    public String getSurgeryCreatedDate(){
        return surgeryCreatedDate;
    }
}
