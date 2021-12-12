package Standard;

import java.util.Random;
class RandomNumber
{
  public static void main(String []args)
{

   String []name={"Amit","Manoj","Hemant","Rahul","Kapil","Suman","Imran"};
   int []age={20,25,29,19,34,28,30};
   String []phone={"123","438","729","456","980","459","367","658","498"};

       for(int i=1;i<=3;i++)
            {	
	Random r=new Random();
	int randomNumber=r.nextInt(age.length);

                   System.out.println(name[randomNumber]);  	
	System.out.println(age[randomNumber]);     
	System.out.println(phone[randomNumber]); 
 
        	System.out.println();   
           }   
          
}
}