package report;
import model.Rep;
import model.Hospital;
import dao.RepDao;
import dao.HospitalDao;
import dao.PaymentDao;
import service.FileProcessing;
import java.util.*;
public class Daily{
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
        file.writeToFile("Rep Payout Report(Daily)",repReport);
    } 
    public void getHospitalTrayUsage(){
        ArrayList<String> hospitalReport=new ArrayList<String>();
         
        file.writeToFile("Hospital Tray Usage(Daily)-",hospitalReport);
    } 
    public void getKptCommission(){
        ArrayList<String> commissionReport=new ArrayList<String>();
        int kptCommission=paymentDao.monthlyKPTCommission();
        String report="Monthly KPT Commission = "+Integer.toString(kptCommission);
        commissionReport.add(report);
        file.writeToFile("KPT Commission Report(Daily)-",commissionReport);
    } 
}