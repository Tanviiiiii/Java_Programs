package loop;

class perfect
{
public static void main(String[] args)
{
int i, sum=0, num=6;
   for(i=1;i<num;i++)
   {
        if(num%i==0)
         {
          sum+=i;
          }
   }
if(sum==num)
{
System.out.println("PERFECT NUMBER");
}
else
{
System.out.println("NOT PERFECT");}

}
}