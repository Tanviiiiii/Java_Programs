package stringexamples;

/* Write a Java program to check whether a given string starts with the contents of another string. 

Sample Output:
Red is favorite color. starts with Red? true                                                                  
Orange is also my favorite color. starts with Red? false    */

class StrtsWith
{
public static void main(String []args)
{
String str1="Red is favorite color";
String str2="Orange is also my favorite color";

Boolean x=str1.startsWith("Red");
Boolean y=str2.startsWith("Red");

System.out.println(x);
System.out.println(y);
}
}