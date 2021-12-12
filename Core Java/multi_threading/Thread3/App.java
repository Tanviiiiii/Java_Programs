class Task extends Thread
{
public void run()
{
for(char c='a';c<='z';c++)
{
System.out.println(c);
}
}
}

class App
{
public static void main(String []args)
{
Task th1=new Task();
Task th2=new Task();

th1.start();
th2.start();
}
}