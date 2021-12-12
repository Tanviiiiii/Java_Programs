package patterns;

/*
ABCDEDCBA
ABCD  DCBA
ABC        CBA
AB              BA
A                    A
*/

class Pattern11
{
   public static void main(String []args)
   {
        int num=5,k=0;
        for(int j=65+num;j>=65;j--)
         {
            for(int i=65;i<j;i++)
           {
              System.out.print((char)i);
            }

            for(int i=1;i<k;i++)
           {
              System.out.print(" ");
            }
                       k+=2;
 for(int i=j-1;i>64;i--)
{
   if(i!=65+num-1)
  {
          System.out.print((char)i);
  }
}
System.out.println();
}
    
   }
}