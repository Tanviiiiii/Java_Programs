package basic_exp;

/*   Return type of  of both parent and child class are different*/

class Test //parent class
{
   Object show()
   {
        System.out.println("1");
        return  null;
   }
}

class Example extends Test//child class
{
   String show()
  {
      System.out.println("2");
      return "shubhi";
   }

    public static void main(String []args)
   {
       Test t=new Test();
        t.show();

       Example obj=new Example();
       obj.show();
   }
}