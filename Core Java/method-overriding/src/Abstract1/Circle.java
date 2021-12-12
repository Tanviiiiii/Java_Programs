package Abstract1;

public class Circle extends Shape
{
   private int radius;

    public Circle(int radius)//Constructor 
   { 
      this.radius=radius;
    }

    public void findArea()
    {
         double area=3.14*radius*radius;
         System.out.println("Area of Circle: "+area);
    }
}