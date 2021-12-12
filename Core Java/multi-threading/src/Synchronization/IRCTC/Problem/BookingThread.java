package Synchronization.IRCTC.Problem;

public class BookingThread extends Thread
{
     private Train train;
     public BookingThread(Train t)
     {
          train=t;
     }

    public void run()
    {
       train.bookSeat();
    }
}