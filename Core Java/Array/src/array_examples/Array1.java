package array_examples;

/* Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
Sample array: [20, 20, 30, 40, 50, 50, 50]
After removing the duplicate elements the program should return 4 as the new length of the array. */

class Array1
{
   public static void main(String []args)
    {
       int arr[]={20,20,90,90,30,40,50,50,50};
       int n=arr.length;
       int m=removeDuplicate(arr,n);
 
      System.out.println("Original Array Length:  "+arr.length);
      System.out.print("Array Elements are: ");
      for(int i=0;i<m;i++)
      {
        System.out.print(arr[i]+" ");
       }
      System.out.println();
      System.out.println("New Array Length:  "+m);
   }

public static int removeDuplicate(int arr[],int n)
{    
   int k=0;
   int a[]=new int[n];
   for(int i=0;i<n-1;i++)
   {
             if(arr[i]!=arr[i+1])
              {
                a[k]=arr[i];
                k++;
              }
   }
a[k]=arr[n-1];
k++;

for(int i=0;i<k;i++)
{
     arr[i]=a[i];
}
return k;
}
}