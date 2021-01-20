public class DeclaringVariables{
    public static void main(String args[]){
        //Declaring Primitive Variables
        int a=10;
        char b='a';
        double c=3.102;
        float d=4.6f;
        long e=1230000;
        boolean yes=true;

        //Declaring Non-Primitive Variables
        Dog f=new Dog();//non-primitive variable is an object reference variable which points to the object 
        f.name="Milo";
        f.age=3;
        f.bark();

        //Declaring Array of Objects

        Dog g[]=new Dog[2];
        g[1]=new Dog();
        g[1].name="Blacky";
        g[1].age=5;
        g[1].bark();
        g[2]=new Dog();
        g[2].name="Browny";
        g[2].age=3;
        g[2].bark();
    }
}
class Dog{
    String name;
    int age;
    void bark(){
        System.out.println(name+" is barking");
    }
}