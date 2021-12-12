package stringexamples;

/* Write a Java program to trim any leading or trailing whitespace from a given string. 

Sample Output:
Original String:  Java Exercises                                                                          
New String: Java Exercises   */

import java.lang.String;
class Trim
{
public static void main(String []args)
{
String str="  Java Exercises  ";
String new_str=str.trim();

System.out.println("Old String :"+ str);
System.out.println("The New String:" + new_str);
}
}