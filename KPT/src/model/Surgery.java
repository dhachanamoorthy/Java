package model;
import java.sql.*;
public class Surgery {
    private int surgeryId;
    private int hospitalId;
    private Timestamp surgeryCreatedDate;   
    private Date surgeryDate;
    public void setSurgeryId(int surgeryId){
        this.surgeryId=surgeryId;
    }
    public void setHospitalId(int hospitalId){
        this.hospitalId=hospitalId;
    }
    public void setSurgeryDate(Date surgeryDate){
        this.surgeryDate=surgeryDate;
    }
    public void setSurgeryCreatedDate(Timestamp surgeryCreatedDate){
        this.surgeryCreatedDate=surgeryCreatedDate;
    }
    public int getSurgeryId(){
        return surgeryId;
    }
    public int getHospitalId(){
        return hospitalId;
    }
    public Date getSurgeryDate(){
        return surgeryDate;
    }
    public Timestamp getSurgeryCreatedDate(){
        return surgeryCreatedDate;
    }
}
