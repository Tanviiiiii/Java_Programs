package basic_exp;

class Test1
{
    void show(String a)
    {
           System.out.println("1");
     }
}

class uvw extends Test1
{
     void show(String a)
      {
           System.out.println("2");
      }

public static void main(String []args)
 {
          Test1 t=new Test1();
            t.show("hello");

     uvw obj=new uvw();
     obj.show("hi");
  }
}

/* uvw obj=new uvw;
     obj.show("hi");//output->2
*/