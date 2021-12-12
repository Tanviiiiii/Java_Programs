package Array_within_array;

/*
         Display the data of 2nd Array
*/
class ArWtAr2
{
    public static void main(String []args)
    {
              int [][]arr=new int[][]{{2,4,5},{3,7,6},{8,4,6}};

             for(int i=0;i<3;i++)
             {
                  System.out.println(arr[1][i]);
              }
    }
}