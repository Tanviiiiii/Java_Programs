package superr;

class AA2
{
   public int x=10;
}

class BB5 extends AA2
{
   public int x=90;
  
   void show()
   {
      System.out.println(super.x);
   }
}

class Demo1
{
    public static void main(String []args)
     {
         new BB5().show();
     }
}