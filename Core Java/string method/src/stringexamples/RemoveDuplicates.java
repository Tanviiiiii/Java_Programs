package stringexamples;

import java.util.*;

class RemoveDuplicates
{
	public static void main(String []args)
	{
	String str="ABABCDE";
	int len=str.length();
	char ch[]=str.toCharArray();
	System.out.println(removeDuplicates(ch,len));
	}

	static String removeDuplicates(char strr[],int l)
	{
	int index=0;
		for(int i=0;i<l;i++)//0,1=B
		{ int j;
			for(j=0;j<i;j++)//0,1
			{
			        if(strr[i]==strr[j])//B==
			       { 
				break;
			       }
			}
		
	
			if(j==i)
			{
			strr[index++]=strr[i];
			}
		}
	return String.valueOf(Arrays.copyOf(strr,index));
}
}