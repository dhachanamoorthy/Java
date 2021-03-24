import service.DataProcessing;
import model.*;
import report.*;
public class App {
    public static void main(String[] args) throws Exception { 
        DataProcessing dataProcessing=new DataProcessing(); 
        
        dataProcessing.process();

        Yearly yearly=new Yearly();
        Monthly monthly=new Monthly();
        yearly.getRepPayout();
        yearly.getHospitalTrayUsage();
        yearly.getKptCommission();
        monthly.getRepPayout();
        monthly.getHospitalTrayUsage();
        monthly.getKptCommission();
    }
}
