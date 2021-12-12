package chechked_exception;
import java.util.*;
class BB
{
public static void main(String [] args)
{
System.out.println("Execution begins");
int num1=10;
int num2=0;
try
{
int res=num1/num2;
System.out.println(res);
}
catch(ArithmeticException ex)
{
System.out.println(ex);
}
System.out.println("Execution ends");
}
}

