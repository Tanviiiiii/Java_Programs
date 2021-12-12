class App
{
   public static void main(String []args)
  {
    TableThread th1=new TableThread(20);
    TableThread th2=new TableThread(34);
    TableThread th3=new TableThread(13);

    th1.start();
    th2.start();
    th3.start();
  }
}