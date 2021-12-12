package staticc;

/* Example
-----------------------
When NON Static Method is NOT used and Without THIS   */


public class Cal
{
   private int x,y,z;//instance variable 

            public static void set(int n1,int n2, Cal t)  //STATIC Method , aur usmai 'Cal t' isleye diya h kuki usmai reference hoga
              {
                       t.x=n1;
                       t.y=n2;
              }

    public static void add(Cal t)
      {
          t.z=t.x+t.y;
          System.out.println(t.z);
     }

   public static void multiply(Cal t)
      {
          t.z=t.x*t.y;
          System.out.println(t.z);
      }

  public static void subtract(Cal t)
     {
          t.z=t.x-t.y;
          System.out.println(t.z);
     }

public static void main(String []args)
{
Cal c=new Cal();
Cal.set(800,400,c);
Cal.add(c);
Cal.subtract(c);
Cal.multiply(c);
}
}
