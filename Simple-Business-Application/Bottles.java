public class Bottles{
    public static void main(String args[]) {
        int no_of_bottles=50;
        String word="bottles";
        
        while(no_of_bottles>0){
            if(no_of_bottles==1){
                word="bottle";
            }
            else{
                word="bottles";
            }
            System.out.println(no_of_bottles + " " + word + " of beer on the wall");
            System.out.println(no_of_bottles + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            no_of_bottles=no_of_bottles-1;
            if (no_of_bottles > 0) {
                System.out.println(no_of_bottles + " " + word + " of beer on the wall");
            } 
            else {
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}   