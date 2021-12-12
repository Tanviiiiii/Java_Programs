package stringexamples;

/* 
Sample Output:

String 1: This is exercise 1                                                                                  
String 2: This is Exercise 1                                                                                  
"This is exercise 1" is equal to "This is Exercise 1" */

import java.lang.String;
class equalsIgnore
{
public static void main(String []args)
 {
String x="This is exercise1";                                                                             
String y="This is Exercise1";

boolean z=x.equalsIgnoreCase(y);
 if(z)
{System.out.println(x+" is equal to "+y);}
else
{System.out.println(x+" is not equal to "+y);}
  }
}