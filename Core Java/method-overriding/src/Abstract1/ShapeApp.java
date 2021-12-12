package Abstract1;

import java.util.Scanner;
class ShapeApp
{
   public static void main(String []args)
   {
        Shape sh=null;
  
        Scanner sc=new Scanner(System.in);
        System.out.println("1: Circle");
        System.out.println("2:Rectangle");
        System.out.println("3:Triangle");
        System.out.println("--------------------");
        System.out.println("Enter your Choice (1/2/3):");
   
        int ch=sc.nextInt();
  
        switch(ch)
      {
            case 1:System.out.print("Enter the radius");
                        int r=sc.nextInt();
                        sh=new Circle(r);
                        break;
 
           case 2:sh=new Rectangle(10,20);
                       break;
    
          case 3:sh=new Triangle(50,10);
                     break;

           default:System.out.println("Wrong Choice..................");
      }
  
      if(sh!=null)
     {
             ShapeMachine.findShapeArea(sh);
       }
   }
}