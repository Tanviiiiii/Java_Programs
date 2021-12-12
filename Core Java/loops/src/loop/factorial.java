package loop;

class factorial
{
public static void main(String[] args)
{
int i,fact=1,n=7;
for(i=1;i<=n;i++)
{
    fact=fact*i;
}
System.out.println(fact);
}
}