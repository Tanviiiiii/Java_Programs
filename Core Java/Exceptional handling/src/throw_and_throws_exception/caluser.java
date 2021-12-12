package throw_and_throws_exception;
class caluser
{
public static void main (String [] args)
{
cal cal=new cal();
try
{
int res=cal.add(90, -30);
System.out.println(res);
}
catch(NumberException ex)
{
System.out.println(ex);
}
}
}
