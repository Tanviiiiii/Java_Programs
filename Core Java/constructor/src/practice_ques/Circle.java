package practice_ques;

class Circle
{
private int Radius;
private double area;
private double circumference;

     public Circle() //Default Constructor
     {
         Radius=10;
     }

     public Circle(int r) //Parameterized Constructor
     {
        this.Radius=r;
     }

     public void Area() //Non Static Method
     {
        area=3.14*Radius*this.Radius;
        System.out.println(area);
     }

    public void Circumference()
    {
         circumference=2*3.14*Radius;
         System.out.println(circumference);
    }

public static void main(String []args)
{
Circle c1=new Circle();
Circle c2=new Circle(5);

c1.Area();
c1.Circumference();

c2.Area();
c2.Circumference();
}
}