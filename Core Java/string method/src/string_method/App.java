package string_method;
class Person
{
       private String name;
       private int age;

       public Person(String name,int age)
       {
           this.name=name;
           this.age=age;
       }

       public String toString() //override kar diya;  Return Person Class Object ki Value
       {
            return "Person[Name="+name+",Age="+age+"]";
       }

}

class App
{
      public static void main(String []args)
      {
       Person p=new Person("Tanvi",20);
       String str=p.toString();
       System.out.println(str);
      }
}
