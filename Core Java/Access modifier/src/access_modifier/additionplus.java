package access_modifier;

public class additionplus extends addition
{
private int num3;
public additionplus(int x, int y, int z)
{
super(x,y);
num3=z;
}
public int add()
{
int result=super.add()+num3;
return result;
}
}
