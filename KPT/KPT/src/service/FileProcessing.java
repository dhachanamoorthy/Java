package service;
import java.io.*;
import java.util.*;
class FileProcessing {  
    Scanner reader=new Scanner(System.in);

    private File csvFile;
    private String fileName;
    public File openFile(){
        try{
            fileName=reader.next();
            csvFile=new File(fileName);
        }
        catch (Exception e) {
            System.out.println("File is not Created");
            e.printStackTrace();
        }
        return csvFile;
    }
}
