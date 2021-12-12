package static_block;

public class AA
{
     static
      {
  System.out.println("FIRST Block executed.......");
       }

    public static void main(String []args)
    {
  System.out.println("Main executed........");      
    }

     static
      {
  System.out.println("SECOND Static block executed.......");
       }

}