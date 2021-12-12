package stringexamples;

/* Write a Java program to test if a given string contains the specified sequence of char values.
Sample Output:

Original String: PHP Exercises and Python Exercises                                                           
Specified sequence of char values: and                                                                      
O/p-> true           */ 

import java.lang.String;
class Contains
{
public static void main(String []args)
{
String x="PHP Exercises and Python";
String y="and";
System.out.println(x.contains(y)); 
}
}