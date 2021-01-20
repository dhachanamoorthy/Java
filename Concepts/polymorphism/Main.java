//polymorphism-many forms

//Parent class contains method operation
class Parent{
    public void operation(int a,int b){
        System.out.println("Let Me Add!! "+(a+b));
    }
}
//Child class 1 which extends Parent overwrites method operation
class Child1 extends Parent{
    public void operation(int a,int b){
        System.out.println("Let Me Subtract!! "+(a-b));
    }
}

//Child class 2 which extends Parent overwrites method operation
class Child2 extends Parent{
    public void operation(int a,int b){
        System.out.println("Let Me Multiply!! "+a*b);
    }
}

//Child class 3 which extends Child1  overwrites method operation 
class Child3 extends Child1{
    public void operation(int a,int b){
        System.out.println("Let Me Divide!!"+a/b);
    }
}
//Main class with main method
public class Main{
    public static void main(String args[]) {
        Parent p=new Parent();
        Child1 c1=new Child1();
        Child2 c2=new Child2();
        Child3 c3=new Child3();
        int a=8,b=5;
        System.out.println("The Two numbers are a="+a+" b ="+b);

        //
        p.operation(a,b);
        c1.operation(a,b);
        c2.operation(a,b);
        c3.operation(a,b);
    }
}