package sleep_method;

class NumberThread extends Thread
{
   public void run()
   {
    for(int n=10;n>=1;n--)
    {
   System.out.println(n);

try
{
Thread.sleep(1000);
}
catch(InterruptedException ex)
{
System.out.println(ex);
}
}
}
}