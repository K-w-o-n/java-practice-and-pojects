public class Student
{

     String name;
     int age;

   

   public static void main(String[] args) 

   {
   	Student student1 = new Student();
   	student1.name = "John doe";
   	student1.age = 18;

   	System.out.println("student name: " + student1.name);
   	System.out.println("Student age " + student1.age);
   }
}