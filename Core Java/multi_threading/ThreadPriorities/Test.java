class Test extends Thread
{
     public void run()
     {
      System.out.println("Child Thread");
      System.out.println(Thread.currentThread().getPriority());
     }

   public static void main(String []args)
   {
       System.out.println("Main Thread");
       System.out.println(Thread.currentThread().getPriority());
      Test th=new Test();
      th.start();
   }
}