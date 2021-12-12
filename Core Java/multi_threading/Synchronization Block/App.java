public class App
{
public static void main(String []args)
{
Train train=new Train(2);

BookingThread th1=new BookingThread(train);
BookingThread th2=new BookingThread(train);

BookingThread th3=new BookingThread(train);
BookingThread th4=new BookingThread(train);

th1.start();
th2.start();
th3.start();
th4.start();
}
}