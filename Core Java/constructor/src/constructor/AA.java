package constructor;

public class AA
{
        public AA()
         {
             this("rehan");
             System.out.println("Constructor1  executed..."); 
         }

         public AA(String x)
           {
                 this(true);
	System.out.println("Constructor2  executed....");
            }

         public AA(boolean z)
           {
                  System.out.println("Constructor3  executed.....");
            }

         public static void main(String []args)
          {
                    new AA();
                    new AA("CETPA");
                    new  AA(true);
          }
}