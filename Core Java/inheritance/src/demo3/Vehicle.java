package demo3;

public class Vehicle
{
     private String model;
     private String color;
     private String make;

Vehicle(String model,String color,String make)   //Non Static parameterized constructor
{
    this.model=model; 
    this.color=color;
    this.make=make;
 
}

public void showVehicle()
{
System.out.println(model);
System.out.println(color);
System.out.println(make);
}
}