import java.io.*;
import java.util.*;
class FileProcessing {  
    Scanner reader=new Scanner(System.in);

    private File csvFile;
    private String fileName;
    public void openFile(){
        try{
            getFileName();
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
            Scanner fileContent=new Scanner(csvFile);
            while(fileContent.hasNextLine()){
                    System.out.println(fileContent.next());
            }
        }
        catch(Exception e){
            System.out.println("Error in Reading File "+e);
        }
    }

    public void getFileName(){
        do{
            fileName=reader.next();
        }
        while(!validateFileName(fileName));
    }

    public boolean validateFileName(String fileName){
        String ext[]=fileName.split(".");
        System.out.println(fileName+" ");
        if(ext[1].equalsIgnoreCase("csv")){
            return true;
        }
        return false;
    }
}
