package exceptional_handling;
public class cal
{
private int x,y,z;
public static void set(int n1, int n2, cal t)
{
t.x=n1;
t.y=n2;
}
public static void add(cal t)
{
t.z=t.x+t.y;
System.out.print(t.z);
}
public static void subtract(cal t)
{
t.z=t.x-t.y;
System.out.print(t.z);
}
public static void multiply(cal t)
{
t.z=t.x*t.y;
System.out.print(t.z);
}
public static void divide(cal t)
{
t.z=t.x/t.y;
System.out.print(t.z);
}
public static void main(String [] args)
{
cal c=new cal();
cal.set(800,400,c);
cal.add(c);
cal.subtract(c);
cal.multiply(c);
cal.divide(c);
}
}





