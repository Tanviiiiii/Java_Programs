package practice_ques;

class Population
{
private int InitialPopulation;
private int Year;
private double Rate;
private double PopGrowth;

    public Population() //Default Constructor
    {
              InitialPopulation=10;
              Year=0;
               Rate=0.0;
               PopGrowth=0.0;
    }

    
   public Population(int i, int y, double r) //Parameterized Constructor
   {
       InitialPopulation=i;
       Year=y;
       Rate=r;
    }

    public void Display()
    {
      PopGrowth=InitialPopulation*(1+Rate/100);
      System.out.println(PopGrowth);
     }

public static void main(String []args)
{
Population p1=new Population(100,2,2.0);
p1.Display();
}

}