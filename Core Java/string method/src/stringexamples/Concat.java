package stringexamples;

/* Write a Java program to concatenate a given string to the end of another string. 

Sample Output:

String 1: PHP Exercises and                                                                                
String 2: Python Exercises                                                                                    
The concatenated string: PHP Exercises and Python Exercises*/

import java.lang.String;

class Concat
{
public static void main(String []args)
{
String x="PHP Exercises and ";                                                                               
String y="Python Exercises ";
String z=x.concat(y);
System.out.println(z);
}
}