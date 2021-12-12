package stringexamples;

/*
WAP a program to REVERSE the word
*/

import java.lang.String;
class Reverse
{
public static void main(String []args)
{
String str="mada",rev=" ";
char ch;
	for(int i=str.length()-1;i>=0;i--)
	{
	   ch=str.charAt(i);
	rev=rev+ch;
	}
System.out.println(rev);
}
}