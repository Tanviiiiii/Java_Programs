package array_examples;

/* Write a Java program to find smallest and second smallest elements of a given array.
METHOD1:
 */

class smallest
{
    public static void main(String []args)
    {
       int arr[]={89,22,3,532,12,321};
       int n=arr.length;
      
       for(int i=0;i<n;i++)
        {
       for(int j=1;j<n;j++)
         {
            if(arr[j-1]>arr[j])
              {
                  int temp=arr[j-1];
                       arr[j-1]=arr[j];
                       arr[j]=temp;
               }
            }
}
for(int k=0;k<n;k++)
 {
   System.out.print(arr[k]+" ");
}
 
System.out.println();
System.out.println("The First Smallest Number is: "+arr[0]);
System.out.println("The Second Smallest Number is: "+arr[1]);
    }
}