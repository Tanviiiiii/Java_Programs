package staticc;

class AA
{
private int x;   //instance variable OR NonStaticVariable

public AA(int n) //Constructor
{
x=n;  
} 
 
        public static void main(String []args)    //this is STATIC therefore object                                                                                                                                                                       reference is needed 
         {
         AA obj=new AA(50);  //obj m reference(unique id) hoga
          System.out.println(obj.x);     //obj.x isleye kiya kuki bina reference ke "x" mai jo value hogi woh nhi milegi
         }
}
