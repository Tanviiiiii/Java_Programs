package constructor;
class AAA
{
static
{
System.out.println("AA loaded");
}
public AAA()
{
System.out.println("constructor of AA executed..");
}
}
class BB extends AAA
{
static
{
System.out.println("BB loaded");
}
public BB()
{
System.out.println("constructor of BB executed..");
}
public static void main (String[] args)
{
new BB();
}
}

