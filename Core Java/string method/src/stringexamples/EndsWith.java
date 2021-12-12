package stringexamples;

/* Write a Java program to check whether a given string ends with the contents of another string. 

Sample Output:

"Python Exercises" ends with "se"? false                                                                      
"Python Exercise" ends with "se"? true
*/

import java.lang.String;
class EndsWith
{
public static void main(String []args)
{
String str1="Python Exercises";
String str2="Python Exercise";

boolean res1=str1.endsWith("se");
boolean res2=str2.endsWith("se");
System.out.println(res1);
System.out.println(res2);
}
}