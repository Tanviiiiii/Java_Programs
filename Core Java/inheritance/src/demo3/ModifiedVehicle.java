package demo3;

public class ModifiedVehicle extends Vehicle
{
        private int No; 
        private int year;

     ModifiedVehicle(String model,String color,String make,int No,int year)
     {
        super(model,color,make);
       this.No=No;
        this.year=year;
      }

    public void showModifiedVehicle()
   {
          showVehicle();
          System.out.println(No);
          System.out.println(year);
   }
}