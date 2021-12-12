package exceptional_handling;
import java.util.*;
class exp1
{
      public static void main(String [] args)
      {
             Scanner sc=new Scanner(System.in);
             System.out.println("command to open connection");
             System.out.println("Enter first number: ");
             int num1=sc.nextInt();
             System.out.println("Enter second number: ");
             int num2=sc.nextInt();
              try 
              {
                 int res=num1/num2;
                 System.out.println("RESULT: " + res);
              }
              catch(NullPointerException ex)
              {
               System.out.println(ex);
              }
              finally
              {
               System.out.println("command to close execution");
              }
         }
 }
