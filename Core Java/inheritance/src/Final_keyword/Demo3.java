package Final_keyword;

class AA1
{
      void show(int x)
      {
         System.out.println("Show of AA");
      }
}

class BB1 extends AA1
{
     void show(int x)
      {
         System.out.println("Show of BB1");
      }
}


class Demo3
{
    public static void main(String []args)
    {
        	BB1 obj=new BB1();
                   obj.show(90);
    }
}