package basics;

class ArrayDemo4
{
public static void main(String []args)
{ 
int []age={12,4,5};
int sum=age[0];
 System.out.println("LOOP");
for(int i=1;i<age.length;i++)
{
   sum=sum+age[i];
}
System.out.println(sum);
}
}