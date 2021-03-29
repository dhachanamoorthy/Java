package dao;
import java.sql.*;
import model.Event;
public class EventDao extends MysqlCon{
    public void createEvent(Event event){
        try{
            checkInConnection();
            PreparedStatement ps=con.prepareStatement("insert into events(surgery_id,hospital_id,event_type,event_time,tray_id) values(?,?,?,?,?)");
            ps.setInt(1,event.getSurgeryId());
            ps.setInt(2,event.getHospitalId());
            ps.setString(3,event.getEventType());
            ps.setTimestamp(4,event.getEventTime());
            ps.setInt(5,event.getTrayId());
            ps.executeUpdate();
        }
        catch (Exception e){
            System.out.println("Error in creating event "+e);
        }
        finally{
            // doCommit();
            checkOutConnection();
        }
    }
    public Event getEventDetails(int surgeryId,int trayId){
        Event event=new Event();
        try{
            checkInConnection();
            PreparedStatement ps=con.prepareStatement("select * from events where surgery_id=? AND tray_id=? AND event_type='CHECK_IN'");
            ps.setInt(1,surgeryId);
            ps.setInt(2,trayId);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                event.setEventId(rs.getInt("event_id"));
                event.setSurgeryId(surgeryId);
                event.setTrayId(trayId);
                event.setEventType(rs.getString("event_type"));
                event.setEventTime(rs.getTimestamp("event_time"));
            }
            
        }
        catch(SQLException e){
            System.out.println("Failed to get event details "+e);
        }
        finally{
            checkOutConnection();
            return event;
        }
    }         
}