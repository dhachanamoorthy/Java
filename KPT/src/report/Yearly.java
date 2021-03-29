package report;
import dao.PaymentDao;
import service.FileProcessing;
import java.util.*;
public class Yearly{
    PaymentDao paymentDao=new PaymentDao();
    FileProcessing file=new FileProcessing();
    public void getRepPayout(){
        ArrayList<String> repReport=new ArrayList<String>();
        repReport=paymentDao.yearlyRepPayout();
        file.writeToFile("Rep Payout Report(Yearly)",repReport);
    } 
    public void getHospitalTrayUsage(){
        ArrayList<String> hospitalReport=new ArrayList<String>();
        hospitalReport=paymentDao.yearlyTrayUsage();
        file.writeToFile("Hospital Tray Usage(yearly)-",hospitalReport);
    } 
    public void getKptCommission(){
        ArrayList<String> commissionReport=new ArrayList<String>();
        commissionReport=paymentDao.yearlyKPTCommission();
        file.writeToFile("KPT Commission Report(Yearly)-",commissionReport);
    } 
}