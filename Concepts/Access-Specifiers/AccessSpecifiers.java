public class AccessSpecifiers{
    public static void main(String args[]) {
        //Default access specifier can be accessed within the package
        int num3;
        Dummy d=new Dummy();
        System.out.println(d.add_public()); 
    }
}
class Dummy{
    //private access specifiers can be accessed only within the class
    private int num1=10;
    //protected access specifiers can be accessed only by the inherited classes
    protected int num2=20;
    //public access specifiers can be accessed anywhere in the program
    public int sum;
     
    private int add(){
        sum=num1+num2;
        return sum;
    }
    public int add_public(){
        return add();
    }
}