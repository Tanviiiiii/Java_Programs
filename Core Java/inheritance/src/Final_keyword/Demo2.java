package Final_keyword;

class AB
{
      void show(int x)
      {
           System.out.println("Show of AA");
      }
}

class BBB extends AB
{
    void show(int x)
    {
           System.out.println("Show of BB");         
    }
}


class Demo2
{
    public static void main(String []args)
    {
BBB obj=new BBB();
obj.show(90);
     }
}