//Inner Class- class within a class
class Outer{
  int a=40;
  //inner class 
  class Inner{
      int b=10;
  }
}

//Main class
public class Main{
    public static void main(String args[]) {
        //Creating object for outer class
        Outer o=new Outer();
        //creating object for inner class using outer class
        Outer.Inner i=o.new Inner();
        System.out.println((i.b+o.a));

    }
}
