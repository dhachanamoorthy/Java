//Multiple Inheritence -Attributes and Methods of parent can be accessed by the multiple child classes
class College{
    String c_name="SIET";
    String code="2727";
    String city="Coimbatore";
    public void collegeInfo(){
        System.out.println("College Name = "+c_name
        +"\nCollege Code = "+code
        +"\nCity = "+city);
    }
}
//Attributes And methods of parent can be accessed by the child

//Student class extends College class and acquire the funtionality of College class
class Student extends College{
    String s_name="Moorthy";
    String roll_no="17IT10";
    String dept="IT";
    public void studentInfo(){
        System.out.println("Student Name = "+s_name
        +"\nRoll Number = "+roll_no
        +"\nDepartment = "+dept);
    }
}
//Teacher class extends College class and acquire the funtionality of College class
class Teacher extends College{
    String t_name="Prasath Kumar V";
    String salary="40000";
    String exp="7 yrs";
    public void teacherInfo(){
        System.out.println("Teacher Name = "+t_name
        +"\nSalary = "+salary
        +"\nExperience = "+exp);
    }
}

//class with main method
public class Main{
    public static void main(String[] args) {
       Teacher t=new Teacher();
       Student s=new Student();
       s.studentInfo();
       s.collegeInfo(); 
       t.teacherInfo();
       t.collegeInfo();    
    }
}