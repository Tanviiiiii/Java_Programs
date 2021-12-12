package array_examples;

/* Write a Java program to find all triplets equal to a given sum in a unsorted array of integers.

Example:
Input Array:
7 5 9 3 0 8 6
Given Sum Of The Array: 12
0,3,9
0,5,7
3,3,6                */

import java.util.Arrays;
class TrippletSort
{
public static void main(String []args)
{
 ArrayTriplets(new int[] {7, 5, 9, 3, 0, 8, 6},12);
}

public static void ArrayTriplets(int []arr,int sum)
{
  System.out.println("Input Array:");
  for(int i=0;i<arr.length;i++)
  {  System.out.print(arr[i]+" ");  }
  System.out.println();

  System.out.println("Given Sum Of The Array: "+sum);

  Arrays.sort(arr);//{0 3 5 6 7 8 9}

   for(int i=0;i<arr.length;i++)
   {
        int left=i;
        int right=arr.length-1;
 
        while(left<right)
        {
               if(arr[i]+arr[left]+arr[right] ==sum)
              { 
                   System.out.println(arr[i]+","+arr[left]+","+arr[right]);
                       left++;  
                       right--;
              }
              else if(arr[i]+arr[left]+arr[right]<sum)
                 {   left++;   }
             else
                    { right--;}
        }
   }
}
}