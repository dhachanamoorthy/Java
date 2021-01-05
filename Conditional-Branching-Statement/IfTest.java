public class IfTest{
    public static void main(String args[]) {
         boolean big;
         int x=10;
         if(x>8){
             big=true;
         }
         else{
             big=false;
         }
         if(big){
            System.out.println(x+" is bigger");
         }
         else{
            System.out.println(x+" is smaller");
         }
    }
}