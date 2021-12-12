package constructor;

public class shoe
{
private String brand;
private int price;
private String color;
private int size;

public shoe(String v1, int v2, String v3, int v4)
{
brand=v1;
price=v2;
color=v3;
size=v4;
}

public void setBrand(String b)
{
brand=b;
}

public void setprice(int p)
{
price=p;
}

public void setcolor(String c)
{
color=c;
}

public void setsize(int s)
{
size=s;
}

public String getbrand()
{
return brand;
}

public int getprice()
{
return price;
}

public int getcolor()
{
return size;
}

public String getsize()
{
return color;
}

public void showData()
{
System.out.println("Brand is: " + brand);
System.out.println("price is: " + price);
System.out.println("color is: " + color);
System.out.println("size is: " + size);
}
}



