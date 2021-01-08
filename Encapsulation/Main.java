class Student{
    
    //private instance variables
    private String name;
    private int age=0;
    private double gpa;

    //setters
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        if(this.age==0)
            this.age=age;
    }

    public void setGpa(double gpa){
        this.gpa=gpa;
    }

    //getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getGpa(){
        return gpa;
    }
}
public class Main{
    public static void main(String args[]){
        Student s1=new Student();
        s1.setName("Moorthy");
        s1.setAge(20);
        s1.setGpa(8.2);
        String name=s1.getName();
        int age=s1.getAge();
        double gpa=s1.getGpa();
        System.out.println(name+" "+age+" "+gpa);
    }
}