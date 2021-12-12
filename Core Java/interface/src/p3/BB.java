package p3;

interface AA
{
    void method1();
}

class BB implements AA
{
    public void method1()
    {
        System.out.println("WELCOME");
    }

   public static void main(String []args)
   {
       AA obj=new BB();
       obj.method1();
   }
} 

/*
AA obj=new BB();
  ---------------------------
Object BB ka ban raha hai...
Aur reference Variable(AA obj) ka type AA hai i.e Interface

*/