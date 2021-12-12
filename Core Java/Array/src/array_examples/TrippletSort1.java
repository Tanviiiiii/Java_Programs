package array_examples;

import java.util.Arrays;

class TrippletSort1
{
 public static void main(String []args)
 {
   arrayTriplet(new int[]{7,5,9,3,0,8,6},12);
 }

  public static void arrayTriplet(int []arr,int sum)
  {
   System.out.println("Input Array:");
   for(int a=0;a<arr.length;a++)
  { System.out.print(arr[a]+" "); }

    System.out.println();
    System.out.println("SUM  :"+sum);
    System.out.println("Tripplet of the given array");
   for(int i=0;i<arr.length;i++)
    {
   for(int j=i+1;j<arr.length;j++)
     {
   for(int k=j+1;k<arr.length;k++)
      {
         if(arr[i]+arr[j]+arr[k]==sum)
         {
          System.out.println(arr[i]+","+arr[j]+","+arr[k]);
         }
       }  
     }
    }
  }
}