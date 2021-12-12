package Standard;

public class Frequency 
{  
      
    public static void main(String[] args)
 {  
          
        //Initialize array   
        int [] arr = new int [] {4,1,7,6,5,4,3,7,8,9,8,7,6,5,1,2,3,4,3,5,6,5,8,9,7,6,5};   
        //Array fr will store frequencies of element  
        int [] fr = new int [arr.length];  
        int visited = -1;  
        
        for(int i = 0; i < arr.length; i++)
         {  
            int count = 1;//agar koi no. repear nhi hua hoga tab uski value 1 show hogi   
            for(int j = i+1; j < arr.length; j++)
            {  
                if(arr[i] == arr[j])
                {  
                    count++;  
                 
                 fr[j] = visited;    //To avoid counting same element again  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
        
        //Displays the frequency of each element present in array  
        System.out.println("---------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
        System.out.println("---------------------");  
    }  
}  