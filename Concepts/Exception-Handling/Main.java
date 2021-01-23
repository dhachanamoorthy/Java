//Exception Handling - handle the runtime errors

//importing scanner to get input
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        //Creating object for scanner
        Scanner in=new Scanner(System.in);
        
        int a=in.nextInt(),b=in.nextInt();
        //try block
        try{
            //block contains code to try
            int result=divide(a,b);
            System.out.println("Division of a and b is "+(a/b));
        }
        catch(Exception e){
            //block to handle errors
            b=1;
            int result=divide(a,b);
            System.out.println("Division of a and b is "+(a/b));
            //e object has a type of exception occured
            System.out.println(e);
        }
    }
    public static int divide(int a,int b){
        if(validateNumber(a,b)){
            return (a/b);
        }
        else{
            return 0;
        }
        
    }
    //creating own exceptions
    public static boolean validateNumber(int a,int b){
        if(a<b){
            throw new ArithmeticException("Can't be Processed since value of a is smaller than b");
            
        }
        else{
            System.out.println("Good Numbers");
            return true;
        }
    }
}