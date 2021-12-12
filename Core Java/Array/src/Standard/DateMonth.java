package Standard;

import java.util.Scanner;
class DateMonth
{
  public static void main(String []args)
  {
       Scanner sc=new Scanner(System.in);

       String []days={"thu","fri","sat","sun","mon","tue","wed"};
       int []date={0,3,3,6,8,11,13,16,19,21,24,26};

       System.out.print("Enter any month of this year:");
       int m=sc.nextInt();

        System.out.print("Enter any date of this month:");
        int d=sc.nextInt();

       System.out.println("Day is:"+days[(d+date[m-1])%7]);      
  }
}
/*
1)  this year Starts from---------------> Friday  (1-Jan) 
therefore at index 1 there is Friday.

2)date
   -------
Jan=0;
Feb=28----> 28%7 */