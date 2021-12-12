package Final_keyword;

/*       show(int) in BB cannot override show(int) in AA
       void show(int y)
         ^
  overridden method is final    */

class AA
{
   void show(int x)  //Parent Class is Final therefor ERROR will occur
   {
        System.out.println("Show of AA");
    }
}


class BB extends AA
{
    void show(int y)
    {
        System.out.println("Show of BB");        
    }
}


class Demo1
{
public static void main(String []args)
{
BB obj=new BB();
obj.show(90);
}
}