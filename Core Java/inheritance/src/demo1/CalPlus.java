package demo1;

public class CalPlus extends Cal  //Child class
{
  private int num3;

public CalPlus(int n1,int n2,int n3) //Constructor
{
      super(n1,n2);  //phely do variable Cal ke pass hai woh value waha se  aajayegi
      num3=n3;
}

public int add()//over-riding add() method of parent class
{
    int r=super.add()+num3; //super.add CalPlus wale method ko call krney ke liye kiya hai
    return r;
}

}