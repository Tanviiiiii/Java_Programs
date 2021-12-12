package Sorting;

class Bubble
{
     public static void main(String []args)
     {                    
         int a[]={100,2,32,90,44};
        int n=a.length;
       	  for(int i=0;i<n;i++)
      	  {     int temp;
	      for(int j=1;j<n;j++)
  	       {
 	          if(a[j-1]>a[j])//100>2
	           {
	              temp=a[j-1];//temp=100
	               a[j-1]=a[j];
	              a[j]=temp;
	           }
	       }
                     }
for(int k=0;k<n;k++)
{
System.out.print(a[k]+" ");
}
     }
}