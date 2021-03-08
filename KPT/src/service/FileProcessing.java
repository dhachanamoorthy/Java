package service;
import java.io.*;
import java.util.*;
class FileProcessing {  
    Scanner reader=new Scanner(System.in);

    private File csvFile;
    private String fileName;
    public void openFile(){
        try{
            fileName=reader.next();
            csvFile=new File(fileName);
            readFile();
        }
        catch (Exception e) {
            System.out.println("File is not Created");
            e.printStackTrace();
        }
    }

    public void readFile(){
        try{
            Scanner content=new Scanner(csvFile);
            while(content.hasNextLine()){
                    System.out.println(content.next());
            }
        }
        catch(Exception e){
            System.out.println("Error in Reading File "+e);
        }
    }
}
