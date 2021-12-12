package stringexamples;

/* Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement. 

Sample string : "The quick brown fox jumps over the lazy dog."

In the above string replace all the fox with cat.

Sample Output:

Original string: The quick brown fox jumps over the lazy dog.                                                 
New String: The quick brown cat jumps over the lazy dog.  */

import java.lang.String;
class Replace1
{
public static void main(String []args)
{
String str="The quick brown fox jumps over the lazy dog";

String new_str=str.replaceAll("fox","dog");
String new_str1=str.replaceAll("dog","fox");

System.out.println(new_str);
System.out.println(new_str1);
}
}         