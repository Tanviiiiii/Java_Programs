package patterns;

/* 
E D C B A
D C B A
C B A
B A
A   */
class pattern4
{
public static void main(String []args)
{
for(int i=5;i>=1;i--)
{
for(int j=i;j>=1;j--)
{
System.out.print((char)(64+j)+" ");
}
System.out.println();
}
}
}
