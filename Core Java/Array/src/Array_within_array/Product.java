package Array_within_array;

public class Product
{
       private int pid;
       private String name;
       private int price;

public Product(int pid,String name,int price)
{
        this.pid=pid;
        this.name=name;
        this.price=price;
} 

public void showProduct()
{
     String data="Product[pid="+pid+", Name="+name+",Price="+price+"]";
      System.out.println(data);
}        

}