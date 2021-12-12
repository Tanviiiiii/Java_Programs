package chechked_exception;
import java.util.*;
class CC
{
public static void main(String [] args)
{
System.out.println("Execution begins");
int x[]={10,20,30};
int y=2;
try
{
int res=x[2]/y;
System.out.println(res);
}
catch(ArithmeticException ex)
{
System.out.println("Arithmetic exception was raised and cauught");
}
System.out.println("Execution ends");
}
}

