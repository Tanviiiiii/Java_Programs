package multithreading;
public class tableThread extends Thread
{
private int num;
public tableThread(int num)
{
this.num=num;
}
public void run()
{
for(int c=1; c<=10; c++)
{
int ta=num*c;
System.out.println(num+ " * " + c+ " = " + ta);
}
}}
