package stringexamples;

/* Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if they having the same length and contain the same characters in the same positions. 

Sample Output:

String 1: This is Exercise 1                                                                                  
String 2: This is Exercise 2                                                                                  
"This is Exercise 1" is less than "This is Exercise 2" */

import java.lang.String;
class Lexicographically
{
public static void main(String []args)
{
String str1="This is Exercise 1 ";
String str2="This is Exerciae 2 ";

System.out.println("String1: "+str1);
System.out.println("String1: "+str2);

int res=str1.compareTo(str2);
if(res<0)
{
System.out.println(str1+"is less than "+ str2);
}
else if(res==0)
{
System.out.println(str1+"is equal to"+ str2);
}
else
{
System.out.println(str1+"is more than"+ str2);
}
}
} 