package basics;

class AdditionOfNumber
{
  public static void main(String []args)
 {
         int []num={10,20,30,40,50,60,70,80,90,100};
         int sum=num[0];

        for(int i=1;i<num.length;i++)
         {
               sum=sum+num[i];
         }
System.out.println(sum);
 }
}