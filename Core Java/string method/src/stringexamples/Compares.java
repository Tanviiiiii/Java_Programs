package stringexamples;

/*Write a Java program to compare a given string to the specified character sequence.
Sample Output:

Comparing: example.com and example.com: true                                                                   
Comparing: Example.com and example.com: false */

import java.lang.String;
class Compares
{
public static void main(String []args)
{
String x="example.com";
String y="example.com";
String z="Example.com";

boolean a=x.equals(y);
boolean b=x.equals(z);
System.out.println(a);
System.out.println(b);
}
}