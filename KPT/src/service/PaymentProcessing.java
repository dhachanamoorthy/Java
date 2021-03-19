package service;
import model.*;
import dao.*;
import util.*;
import java.sql.*;
public class PaymentProcessing {
    Payment payment=new Payment();
    PaymentDao paymentDao=new PaymentDao();
    EventDao eventDao=new EventDao();
    TrayDao trayDao=new TrayDao();
    DateFormat dateFormat=new DateFormat();
    SurgeryDao surgeryDao=new SurgeryDao();
    public void processPayment(Event checkOutEvent){
        int surgeryId=checkOutEvent.getSurgeryId();
        int trayId=checkOutEvent.getTrayId();
        Event checkInEvent=eventDao.getEventDetails(surgeryId,trayId);
        Tray tray=trayDao.getTrayDetails(trayId);
        Surgery surgery=surgeryDao.getSurgeryDetails(surgeryId);
        setPaymentData(checkInEvent,checkOutEvent,surgery,tray);
    }

    public void setPaymentData(Event checkInEvent,Event checkOutEvent,Surgery surgery,Tray tray){
        payment.setSurgeryId(surgery.getSurgeryId());
        payment.setHospitalId(surgery.getHospitalId());
        payment.setRepId(tray.getRepId());
        payment.setTrayId(checkInEvent.getTrayId());
        payment.setEventId(checkInEvent.getEventId());
        payment.setTrayCheckInTime(checkInEvent.getEventTime());
        payment.setTrayCheckOutTime(checkOutEvent.getEventTime());
        payment.setTrayUsage(1);
        payment.setRepPayout(detectCommission(tray.getChargesPerDay()));
        payment.setKptCommission(calculateCommission(tray.getChargesPerDay()));
        payment.setPaymentTime(new Timestamp(System.currentTimeMillis()));
        paymentDao.doPayment(payment);

        //testing
        // dateFormat.calculateDays(checkInEvent.getEventTime(),checkOutEvent.getEventTime());
    }
    public int detectCommission(int totalCharge){
        int commission=totalCharge/5;
        return totalCharge-commission;
    }

    public int calculateCommission(int totalCharge){
        return totalCharge/5;
    }

}