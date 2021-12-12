package Array_within_array;

class App
{
   public static void main(String []args)
   {
      Product p[]=new Product[5];

      p[0]=new Product(101,"AAA",3000);
      p[1]=new Product(102,"BBB",5000);
      p[2]=new Product(103,"CCC",7000);
      p[3]=new Product(104,"DDD",9000);
      p[4]=new Product(105,"EEE",2300);

        for(int i=0;i<p.length;i++)
         {
                  p[i].showProduct();
          }
   }
}