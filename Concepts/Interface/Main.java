//Interface -it is an another way to hiding details and methods in interface are abstract in default
interface Hide{
    public void interface_method();//Interface methods doesn't have a body
}
//implements keyword is used to inherit interface
class Ordinary implements Hide{
    //Body for interface method can be only defined in inherited class 
    public void interface_method(){
        System.out.println("This is abstract method");
    }
}
 public class Main{
     public static void main(String args[]) {
         Ordinary o=new Ordinary();//Creating object for inherited class
         o.interface_method();
     }
 }