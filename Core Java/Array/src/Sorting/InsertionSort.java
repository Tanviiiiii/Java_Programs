package Sorting;


class InsertionSort{
     public static void main(String []args){
    int []a={100,37,34,4,06,45,33};
    for(int j=1;j<7;j++)
    {
        int key=a[j];            
     
        int i=j-1; 
        while(i>=0 && key<=a[i]) 
        {
            a[i+1]=a[i];                
            i=i-1;        
        }
             a[i+1]=key;
    }
System.out.println("Sorted Elements");
for(int i=0;i<7;i++)
{
 System.out.println(a[i]);
}
}
}