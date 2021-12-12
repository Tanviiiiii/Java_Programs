package p2;

interface AA
{
  void method1();
}

interface BB
{
   void method2();
}

class DD implements AA,BB
{
   public void method1()
   {}
   public void method2()
   {}
}