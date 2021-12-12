package Synchronization.IRCTC.Problem;

public class Train
{
   private int no_of_seats;
   
   public Train(int no_of_seats)
   {
      this.no_of_seats=no_of_seats;
   }

   public void bookSeat()
   {
Thread th=Thread.currentThread();
String name=th.getName();
System.out.println(name+"Clicked on book seat........");

        if(no_of_seats>0)
         {
	try
	{
           	  System.out.println("BOOKING OF SEATS IS IN PROGRESS......FOR THREAD "+name);
	
	Thread.sleep(1000);
            	  System.out.println("Seats booked for thread......"+name);
            	  no_of_seats--;
	}catch(Exception ex){}
         }
        else
        {
           System.out.println("Sorry no Seats Left");
        }
   }
}
