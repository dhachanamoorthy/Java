class Event {
    private int event_id;
    private int surgery_id;
    private String tray_status;
    private String event_time;
     
    public void setEventID(int event_id){
        this.event_id=event_id;
    }

    public void setSurgeryID(int surgery_id){
        this.surgery_id=surgery_id;
    }

    public void setTrayStatus(String tray_status){
        this.tray_status=tray_status;
    }

    public void setEventTime(String event_time){
        this.event_time=event_time;
    }

    public int getEventID(){
        return event_id;
    }

    public int getSurgeryID(){
        return surgery_id;
    }

    public String getTrayStatus(){
        return tray_status;
    }

    public String getEventTime(){
        return event_time;
    }
}
