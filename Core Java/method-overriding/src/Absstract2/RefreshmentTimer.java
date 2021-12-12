package Absstract2;

import java.util.*;
class RefreshmentTimer
{
     static int time;

     static void setTimer()
       {
            Random ra=new Random();
            time=ra.nextInt(11)+10;
            System.out.println("Wait"+time+"seconnds");

           for(int i=time;i>=1;i--)
            {
                  System.out.print(i+" ");
                  try{
                  Thread.sleep(1000);
                  }catch(Exception ex){}
             }

           System.out.println();
       }
}