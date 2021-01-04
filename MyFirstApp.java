// First App with main method
public class MyFirstApp{
    public static void main(String[] args) {
       System.out.println("I am Moorthy"); 
       //Declaration
        int a;
        String b;
        double c;
        //Assignment
        a=10;
        b="moorthy";
        System.out.println("a="+a+" b="+b);
        //method calls(Random function)
        c=Math.random();
        System.out.println("c="+c);
        //Looping
        //1.for loop
        for(int i=0;i<a;i++){
            System.out.println(i);
        }
        //2.while loop
        while(a>0){
            System.out.println(a);
            a--;
        }
   } 
}