//single inheritence
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
public class Main{
    public static void main(String[] args) {
       Student s=new Student();
       s.studentInfo();
       s.collegeInfo();    
    }
}
