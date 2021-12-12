package patterns;

class series3
{
public static void main(String []args)
{
int i,j=1;
double s=0.0;
for(i=1;i<=10;i++)
{
s=Math.pow(i,2)-1;//s=i*i-1;
System.out.print(s+" ,");
j++;
}
}
}