package string_method;
class Persoon
{
   private String name;
   private int age;

   public Persoon(String name,int age)
  {
       this.name=name;
       this.age=age;
  }
}

class App2
{
    public static void main(String []args) 
    {
        Persoon p=new Persoon("Tanvi",20);
        System.out.println(p);//Sopln(p.toString());
    }
}