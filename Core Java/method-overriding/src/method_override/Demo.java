package method_override;

class AA //Parent Class
{
    int show()
    { 
           System.out.println("Show of AA");
            return 10;
     }
}


class BB extends AA//Child class
{
   int show()
  {
      System.out.println("Show of BB");
       return 60;
   }
}



class Demo
{
     public static void main(String []args)
     {
          new BB().show();
          new AA().show();
      }
}