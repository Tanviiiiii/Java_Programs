package constructor;

class TestingCal
{
   public static void main(String []args)
   {
           CalPlus c=new CalPlus(200,300,100);
           int r=c.add();
System.out.println(r);
   }
}