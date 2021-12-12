package stringexamples;

/* Write a Java program to create a unique identifier of a given string. 
Sample Output:

The hash for Python Exercises. is 863132599 */

class HashCode
{
public static void main(String []args)
{
String str="Python Exercises";
int hash_code=str.hashCode();
System.out.println("The hash for Python Exercises: "+ hash_code);
}
}
