class App
{
public static void main(String []args)
{
Task ta=new Task();
Thread th1=new Thread(ta);
Thread th2=new Thread(ta);
th1.start();
th2.start();
}
}