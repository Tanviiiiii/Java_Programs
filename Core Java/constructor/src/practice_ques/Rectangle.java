package practice_ques;

public class Rectangle
{
private int length;
private int breadth;
private int area;

      public Rectangle() //Default constructor
      {
          length=4;
          breadth=5;
      } 
  
      public Rectangle(int l, int b)//parameterized constructor
      {
          this.length=l;
          this.breadth=b; 
        }

   public void Area()
   {
     area=this.length*this.breadth;    
     System.out.println(area); 
   }

   public static void main(String []args)
  {
  Rectangle r1=new Rectangle();
  Rectangle r2=new Rectangle(3,2);

r1.Area();
r2.Area();
   }
}