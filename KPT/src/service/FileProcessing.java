package service;
import java.io.*;
import java.util.*;
public class FileProcessing {  
    Scanner reader=new Scanner(System.in);

    private File csvFile;
    private String fileName;
    public ArrayList<String> readFile(){
        ArrayList<String> dataList=new ArrayList<String>();
        try{
            csvFile=new File("surgery.csv");
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
        reader.close();
        return dataList;
    }
    
}
