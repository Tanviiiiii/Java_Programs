package method_cant_override;

class Ex1
{
     void show()
     {
           System.out.println("1");
     }
}

class AA extends Ex1
{
     void show()
    {
        System.out.println("2");
     }

     public static void main(String []args)
     {
             AA obj=new AA();
             obj.show();
     }

}