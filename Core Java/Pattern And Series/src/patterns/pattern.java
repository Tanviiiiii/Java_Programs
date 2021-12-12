package patterns;

/*
        1
      121
    12321
  1234321
123454321
  1234321
    12321
      121
        1
*/
class pattern
{
public static void main(String []args)
{
for(int i=1;i<=5;i++)
{
         for(int sp=4;sp>=i;sp--)
        {
           System.out.print(" ");
        }
 for(int j=1;j<=i;j++)
 {
 System.out.print(j);
 }
    for(int k=i-1;k>=1;k--)
    {
     System.out.print(k);
     }
System.out.println();
}

int m=1;
     for(int i=4;i>=1;i--)
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