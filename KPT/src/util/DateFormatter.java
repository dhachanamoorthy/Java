package util;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
public class DateFormatter{
    SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat datetime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public java.util.Date convertToDate(String sDate){
        java.util.Date d =new java.util.Date();
        try {
            d =f.parse(sDate);
        } catch (Exception e) {
            System.out.println("Error in converting date "+e);
        }
        return d;
    }
    public java.util.Date convertToDateTime(String sDate){
        java.util.Date d =new java.util.Date();
        try {
            d =datetime.parse(sDate);
        } catch (Exception e) {
            System.out.println("Error in converting date "+e);
        }
        return d;
    }
    public long convertToMilliseconds(Date date){
        long milliseconds = date.getTime();
        return milliseconds;
    }
    public Date convertTosqldate(String date){
        java.util.Date d=convertToDate(date);
        long milliseconds=d.getTime();
        Date sqldate=new Date(milliseconds);
        return sqldate;
    }
    public Timestamp convertToSqlTimestamp(String sDate){
        java.util.Date date=convertToDateTime(sDate);
        Timestamp timestamp = new Timestamp(date.getTime());
        return timestamp;
    }

    public int calculateDays(Timestamp checkIn,Timestamp checkOut){
        long checkInMilliSec=checkIn.getTime();
        long checkOutMilliSec=checkOut.getTime();
        long milliseconds=checkOutMilliSec-checkInMilliSec;
        long seconds=milliseconds/1000;
        int days=(int)seconds/86400;
        System.out.println("Timestamp ="+days);
        return days;
    }

    public String getDateTimeString(){
        java.util.Date date = java.util.Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        return dateFormat.format(date); 
    }
}
