package superr;

class AA1
{
    public AA1()//Parameterized Constructor
    {
        System.out.println("Constructor of AA executed.........");
     }
}


class BB1 extends AA1
{
    public BB1()
   {
       super();
       System.out.println("Constructor of BB1 executed.........");      
   }

    public static void main(String []args) 
    {
               new BB1();
    }
} 