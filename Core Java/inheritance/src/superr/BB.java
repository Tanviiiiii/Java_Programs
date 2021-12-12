package superr;

class AA
{
    public AA(int x)//Parameterized Constructor
    {
        System.out.println("Constructor of AA executed.........");
     }
}


class BB extends AA
{
    public BB()
   {
       super(30);
       System.out.println("Constructor of BB executed.........");      
   }

    public static void main(String []args) 
    {
               new BB();
    }
} 