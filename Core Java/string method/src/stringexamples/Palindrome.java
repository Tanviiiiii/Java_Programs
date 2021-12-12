package stringexamples;

/*
Palindrome String
*/
import java.lang.String;
import java.util.*;
class Palindrome
{
public static void main(String []args)
{
String rev="",str;
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The String: ");
 str=sc.nextLine();

	for(int i=str.length()-1;i>=0;i--)
	{
	ch=str.charAt(i);
	rev=rev+ch;
	} 

	if(str.compareTo(rev)==0)//if(str.equals(rev))
	{
	    System.out.println(str+"The String is Palindrome");
	}
	else
	{
	    System.out.println(str+"Not a Palindrome String");
	}
str=" ";
}
}