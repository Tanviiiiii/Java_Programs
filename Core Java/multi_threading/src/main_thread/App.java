package main_thread;

class MyThread extends Thread
{
public void run()
{
System.out.println("A");
System.out.println("B");
System.out.println("C");
}
}

class App
{
public static void main(String []args)
{
MyThread th=new MyThread();
th.start();
System.out.println("X");
System.out.println("Y");
System.out.println("Z");
}
}