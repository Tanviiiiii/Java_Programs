package stringexamples;

/* Write a Java program to get the contents of a given string as a byte array. 
Sample Output:
The new String equals This is a sample String. */


class ByteArray
{
public static void main(String []args)
{
String str="This is a sample String";

byte br[]=str.getBytes();//isse sequence of character aagaya array ke ander

String new_str=new String(br);//isse wapis string ke form mai ban gaya

System.out.println("The new String equals "+ new_str);

System.out.println();
System.out.println("SEQUENCE OF CHARACTER IS: ");
for(int i=0;i<br.length;i++)
{
System.out.println(br[i]);
}
}
}
