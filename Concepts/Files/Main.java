//File Handling

//Files class can be imported from java.io package
import java.io.File;

//File Writer can be imported from java.io.FileWriter package
import java.io.FileWriter;

//Scanner class is used for read file
import java.util.Scanner;

// Import the IOException class to handle errors
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        try{
            //Creating File Object
            File myFile=new File("Topics-Covered.txt");//File name can be passed as argument in file contructor 

            //To create a new File
            System.out.println(myFile.createNewFile());

            //To Get File name 
            System.out.println(myFile.getName());

            //To write on the file
            FileWriter writer=new FileWriter("Topics-Covered.txt");
            writer.write("1-Objects \n"
            +"2-Encapsulation \n"
            +"3-Packages \n"
            +"4-Inheritance \n"
            +"5-Polymorphism \n"
            +"6-Abstraction \n"
            +"7-Interface \n"
            +"8-Collections \n"
            +"9-RegEx \n"
            +"10-Lambda Expression \n"
            +"11-File Handling(On Progress)");

            //To read File
            Scanner reader=new Scanner(myFile);

            while(reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
            //To close the file
            writer.close();
        }
        catch (IOException e) {
            System.out.println("File is not Created");
            e.printStackTrace();
        }
    }
}