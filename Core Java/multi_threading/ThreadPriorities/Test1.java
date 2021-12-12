class Test1 extends Thread
{
   public void run()
   {
      System.out.println("Child Thread");
System.out.println(Thread.currentThread().getPriority());
   }

   public static void main(String []args)
   {
     System.out.println("Main Thread Old Priority:" +Thread.currentThread().getPriority());

Thread.currentThread().setPriority(10);
System.out.println("Main Thread New Priority: "+Thread.currentThread().getPriority());

Test1 t=new Test1();
t.start();
   }
}