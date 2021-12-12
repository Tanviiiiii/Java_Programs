package abstraction2;

class Test
{
   public static void main(String []args)
{
ArithmeticOperation ao=new Multiplication();
ao.acceptNumber(111,12);
ao.performTask();
ao.showResult();
}
}