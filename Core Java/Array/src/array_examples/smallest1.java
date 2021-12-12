package array_examples;

/*
Write a Java program to find smallest and second smallest elements of a given array.
*/
import java.lang.*;
class smallest1
{
   public static void main(String []args)
   {
      int arr[]={5,-1,0,22,-23,43,-222};
      int first,sec,n=arr.length;
   
      first=sec=Integer.MAX_VALUE;

      for(int i=0;i<n;i++)
      {
          if(arr[i]<first)//5<27141//-1<5//0<-1
          {
              sec=first;//sec<271457//sec=5
              first=arr[i];//first=5//first=-1
          }
         else if(arr[i]<sec && arr[i]!=first)//0<5 && 0!=-1
          {
                sec=arr[i];//sec=0
          }
}
         
System.out.println("The smallest element is: "+first +"and Second element is:" +sec);
           
      }
   }
