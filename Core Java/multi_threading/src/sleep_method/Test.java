package sleep_method;

class Test
{
public static void main(String []args)
{
for(int i=1;i<=10;i++)
{
    try
    {
       Thread.sleep(1000);
        System.out.println(i);
    }

    catch(Exception ex)
    {
System.out.println(ex);
    }
  }
 }
}