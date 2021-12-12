package Absstract2;

import java.util.Scanner;
class Cafeteria
{
      public static void main(String []args)
      {
              Refreshment rf=null;
              Scanner sc=new Scanner(System.in);
              
             System.out.println("1:Tea");
             System.out.println("2:Coffee");
             System.out.println("3:Soup");
             System.out.println("-----------------------");
             System.out.println("Enter your choice (1/2/3): ");
      
            int ch=sc.nextInt();
            switch(ch)
            {
                    case 1:rf=new Tea();
                                    break;
                    case 2:rf=new Coffee();
                                    break;
                   case 3:rf=new Soup();
                                    break;
                    default: System.out.println("Wrong Choice...................");
            }
               
                if(rf!=null)
               {
                        WendingMachine.turnOn(rf);
               }
      }
}