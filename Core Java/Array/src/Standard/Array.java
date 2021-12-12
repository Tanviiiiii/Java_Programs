package Standard;

class Array
{
public static void main(String []args)
{
String Phone="",Name="";
   String []name={"Amit","Manoj","Hemant","Rahul","Kapil","Suman","Imran"};
   int []age={20,25,29,19,34,28,30};
   String []phone={"123","438","729","456","980","459","367","658","498"};

int max=age[0];
for(int i=0;i<age.length;i++)
  { 
   if(age[i]>max)
     {
        max=age[i];
        Name=name[i];
        Phone=phone[i];
       }
  }

System.out.println(max);
System.out.println(Name);
System.out.println(Phone); 
  }
}
