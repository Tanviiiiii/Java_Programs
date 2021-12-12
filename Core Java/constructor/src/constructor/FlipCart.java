package constructor;
class FlipCart
{
public static void main(String[] args)
{
shoe s1, s2, s3;
s1=new shoe("adidas", 4000, "blue", 8);
s2=new shoe("nike", 5000, "red", 8);

System.out.println("Before changing size");
s1.showData();
s2.showData();
s2.setsize(9);
System.out.println("After changing size");
s2.showData();
}
}



