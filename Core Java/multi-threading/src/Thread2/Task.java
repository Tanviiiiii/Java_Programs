package Thread2;

class Task implements Runnable
{
   public void run()
   {
       for(char ch='A';ch<='Z';ch++)
       {
          System.out.println(ch);
       }
   }
}