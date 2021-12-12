package chechked_exception;
import java.util.*;
class AA
{
      public static void main(String [] args)
      {
             Scanner sc=new Scanner(System.in);
             System.out.println("Execution begins");
             System.out.println("Enter first number: ");
              int num1=sc.nextInt();
              System.out.println("Enter second number: ");
              int num2=sc.nextInt();
              try 
              {
                 int res=num1/num2;
                 System.out.println("RESULT: " + res);
              }
            catch(Exception ex)
           {
             System.out.println(ex);
            }
               System.out.println("Execution ends");
        }
}
