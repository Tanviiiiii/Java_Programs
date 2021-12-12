package superr;

class AA5
{
    public AA5() //Parent -DEFAULT Constructor
    {
        System.out.println("Constructor1 of AA executed.........");
     }

    public AA5(int x) // Parent- PARAMETERIZED Constructor
    {
        System.out.println("Constructor2 of AA executed.........");
     }
}


class BB3 extends AA5
{
    public BB3()
   {
       super(); // Parent-Default Constructor execute hoga aur Child ka constructor
       System.out.println("Constructor of BB3 executed.........");      
   }

    public static void main(String []args) 
    {
               new BB3();
    }
} 