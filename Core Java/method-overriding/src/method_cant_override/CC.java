package method_cant_override;

class Ex3
{
     private void show()
     {
           System.out.println("1");
     }
}

class CC extends Ex3
{
     void show()
    {
        System.out.println("2");
     }

     public static void main(String []args)
     {
             CC obj=new CC();
             obj.show();
     }

}
/* 
private : bas class EX3 ke ander he accessible hai.
class CC mai accessible nhi ho skta toh isleye class CC "void show()" ko apna method bana lega

isleye compiler ho jayega without any error */