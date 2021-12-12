package abstraction2;

public abstract class ArithmeticOperation
{
       protected int num1;
        protected int num2;
        protected int res;

public void acceptNumber(int num1,int num2)//Method
 {
         this.num1=num1;
         this.num2=num2;
 }

public abstract void performTask(); //iska implementation har class mai aalg aalg hoga isleye aabstract banaya hai

public void showResult()
{
System.out.println(res);
}
}