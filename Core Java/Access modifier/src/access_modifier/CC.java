package access_modifier;
class AA
{
       public AA()
       {
           System.out.println("constructor of AA executed..");
       }
}
       class CC extends AA
        {
        public CC()
     {
         super(); // u can write otherwise it will be inserted by compiler also
        System.out.println("constructor of BB executed..");
     }
         public static void main(String[] args)
          {
            new CC();
          }
        }
