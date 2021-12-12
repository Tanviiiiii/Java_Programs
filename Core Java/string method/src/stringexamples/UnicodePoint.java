package stringexamples;

/*
Write a Java program to get the character (Unicode code point) at the given index within the String. 

Sample Output:

Original String : w3resource.com                                                                              
Character(unicode point) = 51                                                                                 
Character(unicode point) = 101 

*/
import java.lang.String;
class UnicodePoint
{
public static void main(String []args)
{
     String str="Java Exercise";
     
     int val1=str.codePointAt(1);
     int val2=str.codePointAt(2);

System.out.println(val1+"\n"+ val2);
}
}