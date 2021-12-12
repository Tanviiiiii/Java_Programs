package polymorphism;

class Display
{
     public void show(int x)
     {
          System.out.println(x);
      }

     public void show(String x)
     {
          System.out.println(x);
      }

     public void show(double x)
     {
          System.out.println(x);
      }

     public void show(char x)
     {
          System.out.println(x);
      }

     public void show(long x)
     {
          System.out.println(x);
      }

}

/*..........................................................................................*/

class Test
{
public static void main(String []args)
{
   Display d;
    d=new Display();

   d.show("Shubhi");
   d.show('1');
   d.show(10);
   
}
}