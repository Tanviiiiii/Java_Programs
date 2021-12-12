package array_examples;

/*Write a Java program to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s.  */

class segregate
{
    public static void main(String []args)
   {                   //  l  l'                        r' r
           int arr[]={0,1,1,0,1,0,1,0,0,1,1};
            int n=arr.length;//11
            int left=0, right=n-1;
 
            while(left<right) //0<10
             {
                 while(arr[left]==0 && left<right)//0==0 && 0<10
                           left++;
                 while(arr[right]==1 && left<right)
                           right--;
 
                    if(left<right)//1<9
                    {
                        arr[left]=0;
	      arr[right]=1;
                        left++;
                        right--;
                    }
             }
for(int k=0;k<arr.length;k++)
  System.out.print(arr[k]);

   }
}