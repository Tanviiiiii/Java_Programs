package superr;

class AA4
{
      public int x=10;
}

 class BB4 extends AA4
{
        public int x=90;

     void show()
     {
         int x=50;
         System.out.println(x); //50     
         System.out.println(super.x);//10
         System.out.println(this.x);//90
     }
}


class Super
{
  public static void main(String []args)
  {
      new BB4().show();
  }
}