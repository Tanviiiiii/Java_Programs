package method_cant_override;

class Ex2
{
     void show()
     {
           System.out.println("1");
     }
}

class BB extends Ex2
{
     void show()
    {
        System.out.println("2");
     }

     public static void main(String []args)
     {
             BB obj=new BB();
             obj.show();
     }

}