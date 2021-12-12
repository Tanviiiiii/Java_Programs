package staticc;

class NS
{
private int x;   //instance variable OR NonStaticVariable

  public NS(int n) //Constructor
  {
   x=n;  
  } 
 
   public void show()   //this is NonStatic Method
    {
    System.out.println(x);  //in this compiler will automatically place 'this.x'   
    System.out.println(this.x);  //& in 'this' it will have reference of the object x
    } 

public static void main(String []args)
{
    NS obj=new NS(50);
    System.out.println(obj.x); //this is static method therefore it is needed to                                                        give the reference of the object
    obj.show(); 
}

}