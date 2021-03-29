package report;
import dao.PaymentDao;
import service.FileProcessing;
import java.util.*;
public class Monthly{
    PaymentDao paymentDao=new PaymentDao();
    FileProcessing file=new FileProcessing();
    public void getRepPayout(){
        ArrayList<String> repReport=new ArrayList<String>();
        repReport=paymentDao.monthlyRepPayout();
        file.writeToFile("Rep Payout Report(Monthly)",repReport);
    } 
    public void getHospitalTrayUsage(){
        ArrayList<String> trayReport=new ArrayList<String>();
        trayReport=paymentDao.monthlyTrayUsage();
        file.writeToFile("Hospital Tray Usage(Monthly)-",trayReport);
    } 
    public void getKptCommission(){
        ArrayList<String> commissionReport=new ArrayList<String>(); 
        commissionReport=paymentDao.monthlyKPTCommission();
        file.writeToFile("KPT Commission Report(Monthly)-",commissionReport);
    } 
}