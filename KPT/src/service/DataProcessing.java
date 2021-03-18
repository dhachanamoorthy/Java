package service;
import model.*;
import dao.*;
import util.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.sql.*;
public class DataProcessing{
    FileProcessing file=new FileProcessing();
    DateFormat dateFormat=new DateFormat();
    Surgery surgery=new Surgery();
    Event event=new Event();
    SurgeryDao surgeryDao=new SurgeryDao();
    EventDao eventDao=new EventDao();
    PaymentProcessing paymentProcessing=new PaymentProcessing();
    ArrayList<String> eventList=new ArrayList<String>(file.readFile());
    public void process(){
        getEventList(eventList);
    }

    public void getEventList(ArrayList<String> events){
        events.forEach((eventString)->{
            ArrayList<String> eventDetails=splitString(eventString);
            processEventArray(eventDetails);
        });
    }

    public ArrayList<String> splitString(String events){
        ArrayList<String> eventDetails=new ArrayList<String>(Arrays.asList(events.split(",")));
        return eventDetails;
    }

    public void processEventArray(ArrayList<String> eventDetails){
        int surgeryId=Integer.parseInt(eventDetails.get(0));
        int hospitalId=Integer.parseInt(eventDetails.get(1));
        int trayId=0;
        Date surgeryDate =dateFormat.convertTosqldate(eventDetails.get(2));
        String eventType= eventDetails.get(3);
        Timestamp eventTime=dateFormat.convertToSqlTimestamp(eventDetails.get(4));
        int eventTypeNumeric=checkEventType(eventType);
        if(eventTypeNumeric==0){
            setSurgeryData(surgeryId,hospitalId,surgeryDate,eventTime);
            surgeryDao.createSurgery(surgery);
        }
        else if(eventTypeNumeric==1){
            trayId=Integer.parseInt(eventDetails.get(5));
            setEventData(surgeryId,hospitalId,trayId,eventType,eventTime);
            eventDao.createEvent(event);
        }
        else{
            trayId=Integer.parseInt(eventDetails.get(5));
            setEventData(surgeryId,hospitalId,trayId,eventType,eventTime);
            eventDao.createEvent(event);
            paymentProcessing.processPayment(event);
        }
    }
    public int checkEventType(String eventType){
        int status=-1;
        if(eventType.contains("SURGERY_CREATED")){
            status=0;
        }
        else if(eventType.contains("CHECK_IN")){
            status=1;
        }
        else{
            status=2;
        }
        return status;
    }

    public void setEventData(int surgeryId,int hospitalId,int trayId,String eventType,Timestamp eventTime){
        event.setSurgeryId(surgeryId);
        event.setHospitalId(hospitalId);
        event.setEventType(eventType);
        event.setEventTime(eventTime);
        event.setTrayId(trayId);
    }

    public void setSurgeryData(int surgeryId,int hospitalId,Date surgeryDate,Timestamp eventTime){
        surgery.setSurgeryId(surgeryId);
        surgery.setHospitalId(hospitalId);
        surgery.setSurgeryDate(surgeryDate);
        surgery.setSurgeryCreatedDate(eventTime);
    }
    
}
