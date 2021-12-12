package patterns;

class Pattern14
{
     public static void main(String []args)
    { int p=5,d=0;
           for(int i=1;i<=5;i++)
           {
            for(int j=1;j<=p;j++)
            {
                 System.out.print(j);
             }
            for(int sp=0;sp<=d;sp++)
           {
                   System.out.print(" ");
           }
              for(int j=p;j>=1;j--)
              {
 System.out.print(j);

}
System.out.println();
p--;
d=d+2;
           }
     }
}