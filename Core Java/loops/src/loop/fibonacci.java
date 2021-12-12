package loop;

class fibonacci
{
public static void main (String[] args)
{
int i,fib,n1=0,n2=1;
System.out.println(n1+" "+ n2);
for(i=2;i<=10;i++)
{
fib=n1+n2;
System.out.println(fib);
n1=n2;
n2=fib;
}
}
}