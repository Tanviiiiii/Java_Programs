package stringexamples;
import java.util.*;
import java.lang.String;

class Blanks
{
public static void main(String []args)
{
String str,new_str="";
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the sentence");
str=sc.nextLine();

//new_str=str.replace(' ','*');
	for(int i=0;i<str.length()-1;i++)
 	{
	ch=str.charAt(i);
	if(ch==' ')
	{
	       ch='*';
	}
	new_str=new_str+ch;
	}
System.out.println(new_str);
}
}