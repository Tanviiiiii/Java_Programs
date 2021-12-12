package loop;

class armstrong
{
   public static void main(String[] args)
   {
   int n=123,temp,rem,result=0;
   temp=n;
       while(n!=0)
       {
        rem=n%10;

        n=n/10;
        result+=(n*n*n);
        }
  if(temp==result)
  {
  System.out.println("Armstrong Number");
  }
  else
 {
  System.out.println("Not a Armstrong Number");
  }
}
}

