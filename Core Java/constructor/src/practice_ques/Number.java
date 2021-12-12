package practice_ques;

class Number
{
private int x,y,s;

    public Number()  //Default Constructor
    {
        x=5;
        y=6; 
    }

public Number(int x,int y)//Parameterised Constructor
{
this.x=x;
this.y=y;
}
   
   public void Sum() //non static
   {
       s=this.x+this.y;
       System.out.println(s);
   }
 
  public static void main(String []args)
{
   Number n1, n2;
   n1=new Number(3,2);
   n2=new Number();

n2.Sum();
n1.Sum();
}
}