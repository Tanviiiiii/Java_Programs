package stringexamples;

/* Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions. 
Sample Output:

String 1: This is Exercise 1                                                                                  
String 2: This is Exercise 2                                                                                  
"This is Exercise 1" is less than "This is Exercise 2"  */

import java.lang.String;
class Compare
{
  public static void main(String []args)
  {
String str1="This is Exercise1";                                                                             
String str2="This is Exercise2";

int x=str1.compareTo(str2);
	if(x<0)
	{
	System.out.println(str1+" is Less than "+str2);   
	} 
	else if(x>0)
	{
	System.out.println(str1+" is More than "+str2);   
	}
	else
	{
	System.out.println(str1+" is equal to "+str2);   	
	}
   }
} 