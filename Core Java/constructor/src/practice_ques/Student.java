package practice_ques;

/*   Question:
      -------------
WAP to print the name of student by creating a STUDENT class. If no name is passed while creating an object of Student class, then the name should be "Unkown" , otherwise the name should be equal to the String value passed while creating object of student class.                  */

class Student
{
private String name;

     public Student(String name)
     {
	this.name=name;
      }
    
      public Student()
      {
            name="Unknown";
      }

     public void showInfo()
    {
         System.out.println(name);
    }

     public static void main(String []args)
     {
    Student s1,s2;
    s1=new Student("Shubhi");
    s2=new Student();

s1.showInfo();
s2.showInfo();
     }
}