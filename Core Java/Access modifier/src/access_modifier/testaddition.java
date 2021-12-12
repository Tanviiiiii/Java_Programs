package access_modifier;

class testaddition
{
       public static void main(String[] args)
   {
      
        additionplus obj= new additionplus(100,200,300);
        int result=obj.add();
        System.out.println(result);
   }
}