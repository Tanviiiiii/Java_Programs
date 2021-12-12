package p1;

//output will not be given ONLY we will check whether program will COMPILE or Not

interface AA
{
      public static void method1()
      {
        System.out.println("This Is Statc Method Of Interface AA");
      }

      public default void method2()
       {
System.out.println("This Is Default Method Of Interface AA");
       }
}

class CC implements AA
{
   void method1()//yeh Class CC ka apna Method Hai..Override nhi ho raha hai kuki rule follow nhi ho raha hai......                                                                                                               ek public hai aur ek void h
   {
 System.out.println("WELCOME");
   }
}