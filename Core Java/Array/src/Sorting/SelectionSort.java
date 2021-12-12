package Sorting;

class SelectionSort
{
   public static void main(String []args)
  {
int []a={120,100,57,3,982,573,2,34,9};
int len=a.length;
int temp;
    for(int i=0;i<len-1;i++)
     {
         int min=i;

       for(int j=i+1;j<len;j++)
       {
                 if(a[j]<a[min])//100<120
                     min=j;        //min=1

     temp=a[min];//temp= 100
     a[min]=a[i];
     a[i]=temp;  
       }
     }

for(int i=0;i<len;i++)
{
System.out.println(a[i]);
}
  }
}