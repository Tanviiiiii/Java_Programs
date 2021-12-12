package Absstract2;

abstract class Refreshment
{
        {
              RefreshmentTimer.setTimer();
        }
 
        abstract void prepareRefreshment();
}

class Tea extends Refreshment
{
       void prepareRefreshment()
       {
          System.out.println("Tea is ready.........");
       }
}

class Coffee extends Refreshment
{
          void prepareRefreshment()
          {
                System.out.println("Coffee is ready...............");
           }
}

class Soup extends Refreshment
{
         void prepareRefreshment()
         {
                  System.out .println("Soup is ready..............");
         }
}

