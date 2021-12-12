package patterns;


class series2
{
public static void main(String[] args)
{
int j=1;
double s=0;
for(int i=1;i<=10;i++)
{
s=Math.pow(i,j);
System.out.print(s+", ");
j++;
}
}
}