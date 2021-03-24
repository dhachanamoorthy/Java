package report;
import model.Rep;
import model.Hospital;
import dao.RepDao;
import dao.HospitalDao;
import dao.PaymentDao;
import service.FileProcessing;
import java.util.*;
public class Yearly{
    RepDao repDao=new RepDao();
    HospitalDao hospitalDao=new HospitalDao();
    PaymentDao paymentDao=new PaymentDao();
    FileProcessing file=new FileProcessing();
    ArrayList<Rep> reps=repDao.getReps();
    ArrayList<Hospital> hospitals=hospitalDao.getHospitals();
    public void getRepPayout(){
        ArrayList<String> repReport=new ArrayList<String>();
        reps.forEach((rep)->{
            int repId=rep.getRepId();
            String repName=rep.getRepName();
            String location=rep.getLocation();
            int repPayout=paymentDao.yearlyRepPayout(repId);
            String report=Integer.toString(repId)+","+repName+","+location+","+Integer.toString(repPayout);
            repReport.add(report);
        });
        file.writeToFile("Rep Payout Report(Yearly)",repReport);
    } 
    public void getHospitalTrayUsage(){
        ArrayList<String> hospitalReport=new ArrayList<String>();
        hospitals.forEach((hospital)->{
            int hospitalId=hospital.getHospitalId();
            String hospitalName=hospital.getHospitalName();
            String location=hospital.getLocation();
            int totalTrayUsage=paymentDao.yearlyTrayUsage(hospitalId);
            String report=Integer.toString(hospitalId)+","+hospitalName+","+location+","+Integer.toString(totalTrayUsage);
           hospitalReport.add(report);
        }); 
        file.writeToFile("Hospital Tray Usage(yearly)-",hospitalReport);
    } 
}