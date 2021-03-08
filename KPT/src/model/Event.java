package model;
class Event {
    private int eventId;
    private int surgeryId;
    private String trayStatus;
    private String eventTime;
     
    public void setEventID(int eventId){
        this.eventId=eventId;
    }

    public void setSurgeryID(int surgeryId){
        this.surgeryId=surgeryId;
    }

    public void setTrayStatus(String trayStatus){
        this.trayStatus=trayStatus;
    }

    public void setEventTime(String eventTime){
        this.eventTime=eventTime;
    }

    public int getEventID(){
        return eventId;
    }

    public int getSurgeryID(){
        return surgeryId;
    }

    public String getTrayStatus(){
        return trayStatus;
    }

    public String getEventTime(){
        return eventTime;
    }
}
