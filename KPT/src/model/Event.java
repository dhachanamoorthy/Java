package model;
import java.sql.Timestamp;
public class Event {
    private int eventId;
    private int surgeryId;
    private int hospitalId;
    private int trayId;
    private String eventType;
    private Timestamp eventTime;  
    public void setEventId(int eventId){
        this.eventId=eventId;
    }

    public void setSurgeryId(int surgeryId){
        this.surgeryId=surgeryId;
    }

    public void setHospitalId(int hospitalId){
        this.hospitalId=hospitalId;
    }

    public void setTrayId(int trayId){
        this.trayId=trayId;
    }

    public void setEventType(String eventType){
        this.eventType=eventType;
    }

    public void setEventTime(Timestamp eventTime){
        this.eventTime=eventTime;
    }

    public int getEventId(){
        return eventId;
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

    public String getEventType(){
        return eventType;
    }

    public Timestamp getEventTime(){
        return eventTime;
    }
}
