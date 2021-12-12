package superr;

class AA3
{
    public AA3() //Parent -DEFAULT Constructor
    {
        System.out.println("Constructor1 of AA executed.........");
     }

    public AA3(int x) // Parent- PARAMETERIZED Constructor
    {
        System.out.println("Constructor2 of AA executed.........");
     }
}


class BB2 extends AA3
{
    public BB2()
   {
       super(22); // Parent-Parameterized Constructor execute hoga aur Child ka constructor
       System.out.println("Constructor of BB2 executed.........");      
   }

    public static void main(String []args) 
    {
               new BB2();
    }
} 