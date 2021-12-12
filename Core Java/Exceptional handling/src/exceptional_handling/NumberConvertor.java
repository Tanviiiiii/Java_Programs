package exceptional_handling;
import java.util.*;
class NumberConvertor
{
static String[ ]x={" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen"};
static String[ ]y={" ", " ", "twenty", "thirty", "fourty", "fifty" ,"sixty", "seventy", "eighty" ,"ninty"};

static void dd(int n)
{
if(n>=1 && n<=19)
System.out.println(x[n]);
if(n>=20 && n<=99)
System.out.println(y[n/10]+" " +x[n%10]);
if(n>=100 && n<=999)
{
dd(n/100);
System.out.println("hundred");
dd(n%100);
}

if(n>=1000 && n<=99999)
{
dd(n/1000);
System.out.println("thousand");
dd(n%1000);
}

if(n>=10000 && n<=9999999)
{
dd(n/10000);
System.out.println("lakh");
dd(n%10000);
}
}
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any number: ");
int n=sc.nextInt();
if(n>=10000000 && n<=999999999)
{
dd(n/10000000);
System.out.println("crore");
dd(n%10000000);
}
else
dd(n);
}
}













