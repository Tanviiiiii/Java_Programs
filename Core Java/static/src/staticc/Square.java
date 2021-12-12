package staticc;

public class Square
{
private int num;

public Square(int n)
{
num=n;
}

public void showSquare1()
{
int sq=num*num;
System.out.println(sq);
}

public static void showSquare2(int n)
{
int sq=n*n;
System.out.println(sq);
}

public static void main(String []args)
{
Square s=new Square(70);
s.showSquare1();//non static
Square.showSquare2(60);

}
}