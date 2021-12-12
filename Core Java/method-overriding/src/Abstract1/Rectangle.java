package Abstract1;

public class Rectangle extends Shape
{
    private int length;
    private int breadth;

    public Rectangle(int length,int breadth)
    {
          this.length=length;
          this.breadth=breadth;
    }
 
    public void findArea()
   {
        int area=length*breadth;
        System.out.println("Area od Rectangle: "+area);
   }
}