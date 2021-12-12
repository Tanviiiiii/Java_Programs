package loop;

class palindrome
{
  public static void main(String[] args)
  {
   int num=121,temp,rev=0,rem;
   temp=num;
     while(num!=0)
   {
     rem=num%10;
     rev=(10*rev)+rem;
     num=num/10;
    }
if(temp==rev)
{
System.out.println("palindrome number");
}
else
{
System.out.println("Not a palindrome number ");
}
}}