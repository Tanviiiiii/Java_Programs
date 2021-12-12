/* 1 ,5 ,11 ,19 ,29 ,41 ,55 ,71 ,89 ,109 */
class series4
{
   public static void main(String[] args)
   {
int s=0,j=0;
       for(int i=1;i<=10;i++)
      {
        s=(i*i)+j;

System.out.print(s+" ,");
j++;
      }
   }
}