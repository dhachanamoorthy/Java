//Looping statements
public class While_Loop{
    public static void main(String args[]) {
        int a=5;
        System.out.println("Before Loop a="+a);
        while(a>0){
            System.out.println("In Loop a="+a);
            a=a-1;
        }   
        System.out.println("After Loop a="+a);
        //while looping using boolean
        System.out.println("loop with boolean condition");
        boolean run=true;
        System.out.println("Before Loop a="+a);
        while(run){
            System.out.println("In Loop a="+a);
            a=a+1;
            if(a==5)
                run=false;
        }
        System.out.println("After Loop a="+a);
    }
}