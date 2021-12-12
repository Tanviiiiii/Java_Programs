/*
1234554321
1234    4321
123        321
12            21
1                1                     */
class Pattern12
{
     public static void main(String []args)
    {
         int i,j,p,d,k;
         k=1;
         p=5;
         d=1;

              for(i=1;i<=5;i++)
              {
                           for(j=1;j<=p;j++)
	        {
                                 System.out.print(j);
	        }
	      
	        for(k=2;k<=d;k++)
                          {
		System.out.print(" ");
	        }
                
                           for(k=p;k>=1;k--)
                           {
                                   System.out.print(k);
                           }
System.out.println();
p=p-1;
d=d+2;
               }
    } 
}