package stringexamples;

/* Write a Java program to get a substring of a given string between two specified positions. 

Sample Output:

old = The quick brown fox jumps over the lazy dog.                                                            
new = brown fox jumps      */

class Substring
{
public static void main(String []args)
{
String str="The quick brown fox jumps over the lazy dog";

String new_str=str.substring(10,26);
System.out.println(new_str);
}
}