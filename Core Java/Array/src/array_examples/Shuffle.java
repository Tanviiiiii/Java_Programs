package array_examples;

/*
Write a Java program to shuffle a given array of integers.

Example:
Input :
nums = { 1, 2, 3, 4, 5, 6 }
Output:
Shuffle Array: [4, 2, 6, 5, 1, 3]
*/

import java.util.Arrays;
import java.util.Random;

class Shuffle
   {
         public static void main(String []args)
         {
          int num[]={1,2,3,4,5,6};
          for(int k=0;k<num.length;k++)
          {   System.out.print(num[k]+" ");}
          System.out.println();
          shuffle(num);

          for(int a=0;a<num.length;a++)
          {System.out.print(num[a]+" ");}
         }
     
     public static void shuffle(int num[])
      {
         for(int i=num.length-1;i>=1;i--)
          {
               Random ra=new Random();
               int j=ra.nextInt(i);
	swap_element(num,i,j);
          }
      }   
         
      public static void swap_element(int num[], int i, int j)
      {
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;
       }
   
}