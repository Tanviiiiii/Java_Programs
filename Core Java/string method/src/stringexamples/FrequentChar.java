package stringexamples;

/* https://www.youtube.com/watch?v=iiA6Bag8UUE*/
 class FrequentChar
{
	public static void main(String []args)
	{
	//String str="ShubhiSharmaSati";
	//System.out.println("Maximum Occuring Character is:"+ maxOccuringChar(str));
	//}

             //	public static char maxOccuringChar(String str)
             //	{
	String str="ShubhiSharmaSatihhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
	int count[]=new int[256];//Create array to keep the count of individual character
	int len=str.length();
	for(int i=0;i<len;i++)		
		count[str.charAt(i)]=count[str.charAt(i)]+1;//isse ek ek character nikalega aur count mai us character ki ASCII value ke                                                                                       array ke  ander jitni baar woh value aayigi uttni baar increment hota rhega  
	
	int max=-1;
	char result=' ';

	for(int i=0;i<len;i++)
	{
	if(max<count[str.charAt(i)])// max<count['S']-> max<count[ASCII of S]
	{
	max=count[str.charAt(i)];
	result=str.charAt(i);//result ke ander woh character h jo maximum time repeat kr raha h
	}
	}
System.out.println("Maximum no. of time it occured: "+max);
System.out.println("Maximum Occuring Character is:"+ result);
	//return result;
	}

}