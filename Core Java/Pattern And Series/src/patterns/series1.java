package patterns;

/*  1,1,2,3,5,8,13,21,34,55,.............  */
class series1
{
     public static void main(String []args)
    {
int a=1,s=0,b=1;
System.out.print(a+" ,");
System.out.print(b+" ,");
           for(int i=1;i<=11;i++)
           {
         s=a+b;
System.out.print(s+" ,");
a=b;
b=s;
          }
}
}
