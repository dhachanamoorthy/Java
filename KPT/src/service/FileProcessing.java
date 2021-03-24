package service;
import util.*;
import java.io.*;
import java.nio.*;
import java.util.*;
import util.DateFormatter;
public class FileProcessing {  
    private File csvFile;
    private String fileName;
    DateFormatter df=new DateFormatter();
    public ArrayList<String> readFile(){
        ArrayList<String> dataList=new ArrayList<String>();
        try{
            String path=getFilePath();
            csvFile=new File(path);
            Scanner myReader = new Scanner(csvFile);
            while (myReader.hasNextLine()) {
                String dataString = myReader.nextLine();
                dataList.add(dataString);
            }
        }
        catch (Exception e) {
            System.out.println("File is not Created");
            e.printStackTrace();
        }
        return dataList;
    }
    public String getFilePath() {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter File Path :");
        String path=reader.next();
        reader.close();
        return path;    
    }
    
    public void writeToFile(String reportType,ArrayList<String> report) {
        try{

            String path=reportType+"-"+df.getDateTimeString()+".csv";
            FileWriter writer = new FileWriter(path);
            String data="";
            for(String line:report){
                data=data+line+"\n";
            };
            writer.write(data);
            writer.close();
            // f.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
