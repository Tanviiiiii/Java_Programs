package stringexamples;

/*
WAP TO Input a word. Print it in a Palindrome form
eg: 
PEN
palindrome form: PENNEP */

import java.util.*;
import java.lang.String;

class PalindromicForm
{
public static void main(String []args)
{
char ch;
String str,rev="";
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String: ");
str=sc.nextLine();

System.out.println("Original String: "+str);
	for(int i=str.length()-1;i>=0;i--)
	{
	ch=str.charAt(i);
	rev=rev+ch;
	}
System.out.println("Reverse String: "+rev);
System.out.println("The Palindromic String: "+str+rev);
}
}