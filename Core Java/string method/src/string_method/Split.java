package string_method;

class Split
{
   public static void main(String []args)
   {
        String str="Mridul;Shubhi;Bhardwaj;Sharma";
        String []x=str.split(";");

         for(int i=0;i<x.length;i++)
         {
             System.out.println(x[i]);
         } 
   }
}