package stringexamples;

/*
Write a Java program to convert all the characters in a string to lowercase.

Sample Output:

Original String: The Quick BroWn FoX!                                                                         
String in lowercase: the quick brown fox!           */

class Lowercase
{
public static void main(String []args)
{
    String str="The Quick BroWn FoX!";

    String new_str=str.toLowerCase();

    System.out.println(new_str);
}
}