package Abstract1;

public class Triangle extends Shape
{
   private int base;
   private int height;

public Triangle(int base,int height)
{
  this.base=base;
  this.height=height;
}
 
 public void findArea()
 {
     double area=.5*base*height;
     System.out.println("Area of Right Angle Triangle: "+area);
 }
}