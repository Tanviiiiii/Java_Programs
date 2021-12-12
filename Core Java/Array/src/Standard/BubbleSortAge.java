package Standard;

class BubbleSortAge
{
   public static void main(String []args)
   {
   String []name={"Amit","Manoj","Hemant","Rahul","Kapil","Suman","Imran"};
   int []age={20,25,29,19,34,28,30};
   String []phone={"123","438","729","456","980","459","367","658","498"};
int temp;
for(int i=0;i<7;i++)
{
for(int j=0;j<7;j++)
{
       if(age[j]<age[j+1]) 
            {
              temp=age[j];
              age[j]=age[j+1];
              age[j+1]=temp;
             }    
}
}
for(int i=0;i<7;i++)
{
       System.out.println(age[i]);
      System.out.println(name[i]);
       System.out.println(phone[i]);
System.out.println();
}
   }
}