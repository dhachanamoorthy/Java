import service.DataProcessing;
import model.*;
import report.*;
public class App {
    public static void main(String[] args) throws Exception { 
        DataProcessing dataProcessing=new DataProcessing(); 
        
        dataProcessing.process();

        Yearly yearly=new Yearly();
        yearly.getRepPayout();
        yearly.getHospitalTrayUsage();
    }
}
