package multithreading;

class task implements Runnable
{
public void run()
{
for(int c=1; c<=10; c++)
{
System.out.println(c);
}
}
}
class test
{
public static void main(String [] args)
{
task t=new task();
Thread th1=new Thread(t);
Thread th2=new Thread(t);
Thread th3=new Thread(t);
th1.start();
th2.start();
th3.start();
}
}


