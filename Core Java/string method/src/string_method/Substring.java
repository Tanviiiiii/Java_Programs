package string_method;

class Substring
{
      public static void main(String []args)
      {
          String str="international";
          String x=str.substring(0,6);
          String y=str.substring(5,11);
          String z=str.substring(5);

             System.out.println(x);//intern
             System.out.println(y);//nation
             System.out.println(z);//national
      }
}