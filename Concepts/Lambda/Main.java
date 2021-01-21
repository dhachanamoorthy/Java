//Lambda Expressions

import java.util.ArrayList; 

public class Main{
    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<Integer>();

        //Adding data to the object
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        //((parameter)->{code to be excuted});
        
        al.forEach( (n) -> {System.out.println(n);});
    }
}