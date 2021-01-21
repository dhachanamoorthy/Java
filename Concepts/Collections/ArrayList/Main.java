//Collections-Framework used to store and manipulate data
//           Collections Framework can be accessed from util packages

//importing ArrayList class from util package

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        //Creating ArrayList object
        //Syntax :-ArrayList<DateType> object_name=new ArrayList<DataType>();
        ArrayList<Integer> al=new ArrayList<Integer>();

        //Adding data to the object
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        //Getting a data from the object

        System.out.println(al.get(0));
        System.out.println(al.get(1));
        System.out.println(al.get(2));
        System.out.println(al.get(3));
        System.out.println(al.get(4));

        //Getting size of the array list
        System.out.println(al.size());

        //Checking Whether the array list empty
        System.out.println(al.isEmpty());

        //Remove element from array list
        System.out.println(al.remove(4));

        //Get last element from array list
        System.out.println(al.lastIndexOf(4));
    }
}