package stringexamples;

/* Write a Java program to replace a specified character with another character. 
Sample Output:
-----------------------
Original string: The quick brown fox jumps over the lazy dog.                                                 
New String: The quick brown fox jumps over the lazy fog.  */

class Replace
{
public static void main(String []args)
{
String str="The quick brown fox jumps over the lazy dog";

String new_str=str.replace('d','f');

System.out.println("Old String: "+ str);
System.out.println("New String: "+ new_str);
}
}