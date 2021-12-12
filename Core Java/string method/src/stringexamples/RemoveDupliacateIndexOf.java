package stringexamples;

import java.util.*;

class RemoveDupliacateIndexOf
{
	public static void main(String []args)
	{
	  String s="SSHUUBBHHII";
	System.out.println(unique(s));
	}

	public static String unique(String str)
	{
	  String str1=new String();
	  int l=str.length();

	for(int i=0;i<l;i++)
	{
	char c=str.charAt(i);
	
	if(str1.indexOf(c)<0)
    	  {
  	       str1=str1+c;
   	  }
	}
return str1;
	}
}