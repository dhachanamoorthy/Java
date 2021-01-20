//Abstract Class-hiding certain details and showing only essential information to the user.
abstract class Hide{
    //Abstract method-it doest contains any function(without body)
    public abstract void hidden();

    //Normal Method 
    public void show(){
        System.out.println("I am ordinary method");
    }
}

//An ordinary class inherits a abstract class
class Ordinary extends Hide{
    //declaring body for the abstract method
    public void hidden() {
        System.out.println("I am a hidden method");
    }
}

public class Main{
    public static void main(String args[]) {
        Ordinary o=new Ordinary();
        Ordinary1 o1=new Ordinary1();
        o.show();
        o.hidden();
    }
}