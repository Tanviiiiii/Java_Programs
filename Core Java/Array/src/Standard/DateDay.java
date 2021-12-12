package Standard;

import java.util.Scanner;
class DateDay
{
   public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
   String [] days={"wed","thu","fri","sat","sun","mon","tue"};
System.out.print("Enter any date of this month: ");
int d=sc.nextInt();
System.out.println("Day is:"+days[d%7]);
}
}

/*
1) ismai jo days lye hai woh April month ke liye he hai .
2) April 1 ko Thrusday hai us hisaab se Thrusday ko 1st Index mai aana chahiye isleye :
wed: 0 index
thrusday: 1index
3) suppose user entered : 18;
18%7=4 .....................now at index 4=sun

*/