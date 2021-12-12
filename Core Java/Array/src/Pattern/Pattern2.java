package Pattern;

/*
0000000000
0000000000
0000000000
0000000000
0000000000
0000000000
0000000000
0000000000
0000000000
0000000000
*/

class Pattern2
{
  public static void main(String []args)
  {
     int arr[][]=new int[10][10];
     for(int i=0;i<10;i++)
     {
      for(int j=0;j<10;j++)
       {
          System.out.print(arr[i][j]);
       }
          System.out.println();
     }
  }
}
/* hamney array mai koi value to assign nhi ki hai .
Aur hamara Array INTEGER type ka hai therefore har array ki value 0 he store hui hogi...*/