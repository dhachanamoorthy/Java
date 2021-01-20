//importing objects from java library
import java.util.*;
class Api{
    public static void main(String args[]){
        //Array List Object from util package
        ArrayList<Integer> al=new ArrayList<Integer>();

        //Treemap ,a Map object
        TreeMap<Integer,String> tm=new TreeMap<Integer,String>();

        String key;
        System.out.println(al.isEmpty());
        for(int i=1;i<=5;i++){
            //inserting numbers to list object
            al.add(i);
            key="Moorthy";
            key+=Integer.toString(i);
            //inserting numbers into treemap
            tm.put(i,key);
        }
        for(int i=1;i<=al.size();i++){
            //printing numbers from list object
            System.out.print(al.get(i-1)+" ");
            System.out.print(tm.get(i)+" ");
        }
        System.out.println();

        //checks whether the list is empty
        System.out.println(al.isEmpty());

        //checks whether the data is available in the list
        System.out.println(al.contains(3));

        //finds the index of the element
        System.out.println(al.indexOf(3));

        //removes the element from list
        System.out.println(al.remove(3));
    }
}