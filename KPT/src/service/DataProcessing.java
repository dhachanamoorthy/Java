package service;
import model.*;
import dao.*;
import java.util.*;
public class DataProcessing extends FileProcessing{
    SurgeryDao surgeryDao=new SurgeryDao();
    ArrayList<String> surgeryList=new ArrayList<String>(readFile());
    public void process(){
        surgeryList.forEach((data)->{
            System.out.println(tray);
            String dataList[]=data.split(",");   
            Surgery surgery=new Surgery();
            Event event=new Event();
            SurgeryTrayInfo surgeryTrayInfo=new SurgeryTrayInfo();
            surgery.setSurgeryId(Integer.parseInt(dataList[0]));
            surgery.setHospitalId(Integer.parseInt(dataList[1]));
            surgery.setSurgeryDate(dataList[2]);
        });
    } 
    
}