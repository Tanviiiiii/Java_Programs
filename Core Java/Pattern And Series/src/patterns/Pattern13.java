package patterns;

/*
 123454321
  1234321
   12321
    121
     1              */

class Pattern13
{
   public static void main(String []args)
   {
int m=1;
     for(int i=5;i>=1;i--)
      {
	for(int j=1;j<=m;j++)
 	{
	System.out.print(" ");
	}
	for(int k=1;k<=i;k++)
	{
	System.out.print(k);
	}
	for(int k=i-1;k>=1;k--)
	{
	System.out.print(k);
	}
System.out.println(); 
m++;
     }     

   }
}