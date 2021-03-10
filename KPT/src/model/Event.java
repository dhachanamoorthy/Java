package model;
public class Event {
    private int eventId;
    private int surgeryId;
    private String trayStatus;
    private String eventTime;  
    public void setEventId(int eventId){
        this.eventId=eventId;
    }

    public void setSurgeryId(int surgeryId){
        this.surgeryId=surgeryId;
    }
    public void setTrayStatus(String trayStatus){
        this.trayStatus=trayStatus;
    }

    public void setEventTime(String eventTime){
        this.eventTime=eventTime;
    }

    public int getEventId(){
        return eventId;
    }

    public int getSurgeryId(){
        return surgeryId;
    }

    public String getTrayStatus(){
        return trayStatus;
    }

    public String getEventTime(){
        return eventTime;
    }
}
