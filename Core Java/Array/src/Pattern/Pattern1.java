package Pattern;

/*
 2 7 9
 3 6 1
 7 4 2
*/

class Pattern1
{
  public static void main(String []args)
  {
    int arr[][]={{2,7,9},{3,6,1},{7,4,2}};
    for(int i=0;i<3;i++) // i -> row 
    {
       for(int j=0;j<3;j++) //j-> column
       {
           System.out.print(arr[i][j]+" ");
       }
System.out.println();
    }
  }
}
/* 
i=0,     j=0,arr[0][0]=2
           j=1,arr[0][1]=7
           j=2,arr[0][2]=9 

i=1,      j=0,arr[1][0]=3
            j=1,arr[0][1]=6
            j=2,arr[0][2]=1 

LET a={2,7,9} b={3,6,1}  c={7,4,2}
toh "i" ke pass a,b,c ke array ki value 0,1,2 hogi
*/