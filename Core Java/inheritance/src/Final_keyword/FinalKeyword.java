package Final_keyword;

/*  error: cannot assign a value to final variable x
        x=50;
        ^
*/
class AA2
{
      void show(int x)
     {
        System.out.println("Show of AA2");
      }
}

class BB2 extends AA2
{
     void show(int x)
     {
         System.out.println("Show of BB2");
      }
}

class FinalKeyword
{
   public static void main(String []args)
   {
         final int x=90;
        int x=50;
   }
}