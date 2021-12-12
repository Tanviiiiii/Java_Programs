package chechked_exception;
import java.util.*;
class DD
{
public static void main(String [] args)
{
System.out.println("Execution begins");
int x[]={10,20,30};
int y=2;
try
{
int res=x[4]/y;
System.out.println(res);
}
catch(ArithmeticException ex)
{
System.out.println("Arithmetic exception was raised and cauught");
}
catch(ArrayIndexOutOfBoundsException ex)
{
System.out.println("Arithmetic index is out of range");
}
System.out.println("Execution ends");
}
}

