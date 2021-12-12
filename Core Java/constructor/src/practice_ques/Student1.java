package practice_ques;

class Student1
{
private int RollNo;
private String Name;
private double Marks;

    public Student1() //Default Constructor
   {
         RollNo=2;
         Name="Amit";
         Marks=57.6;
   }

    public Student1(int rollno, String name, double marks) //Parameterized Constructor
   {
         RollNo=rollno;
         Name=name;
         Marks=marks;
   }

   public void Display()//Non Static Method
   {
          if(this.Marks>50.0)
          {
                 System.out.println(this.RollNo);
                 System.out.println(this.Name);
                 System.out.println(Marks);
                 System.out.println();
           }
   }

   public static void main(String []args)
  {
   Student1 s1=new Student1();
   Student1 s2=new Student1(211,"Shubhi",99.0);

   s1.Display();
   s2.Display();
  }
}