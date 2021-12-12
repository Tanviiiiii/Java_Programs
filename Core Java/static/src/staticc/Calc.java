package staticc;

/*   Example
-----------------------
When NON Static Method is used and With THIS  */

public class Calc
{
      private int x,y,z;//instance variable

     public void set(int n1,int n2)
      {
            x=n1; // this.x=n1;  yeah internally Compiler khud THIS laga lega                            hamko krne ki zarurat nhi h. 
            y=n2; //  this.y=n2;
      }

      public void add()
      {
          z=x+y;  
System.out.println(z);
       }

      public void subtract()
      {
          this.z=this.x-this.y;
System.out.println(this.z);
       }

      public void multiply()
      {
          z=x*y;
System.out.println(z);
       }

public static void main(String []args)
{
Calc c=new Calc();
c.set(700,800);
c.add();
c.multiply();
c.subtract();
}
     
}