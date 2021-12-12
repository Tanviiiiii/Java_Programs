package stringexamples;

/* Write a Java program to get the last index of a string within a string.
Sample Output:

 a  b c  d  e  f  g  h i  j                                                                                   
===========================                                                                                   
36 10 7 40 33 16 42 32 6 20                                                                                   
                                                                                                              
k  l  m  n  o  p q  r  s  t                                                                                   
===========================                                                                                   
8 35 22 14 41 23 4 29 24 31                                                                                   
                                                                                                              
 u  v  w  x  y  z                                                                                             
=================                                                                                             
21 27 13 18 38 37
Sample string of all alphabet: "The quick brown fox jumps over the lazy dog." */

class LastIndexPattern
{
public static void main(String []args)
{
String str="The quick brown fox jumps over the lazy dog";

int a=str.lastIndexOf('a');
int b=str.lastIndexOf('b');
int c=str.lastIndexOf('c');
int d=str.lastIndexOf('d');
int e=str.lastIndexOf('e');
int f=str.lastIndexOf('f');
int g=str.lastIndexOf('g');
int h=str.lastIndexOf('h');
int i=str.lastIndexOf('i');
int j=str.lastIndexOf('j');
int k=str.lastIndexOf('k');
int l=str.lastIndexOf('l');
int m=str.lastIndexOf('m');
int n=str.lastIndexOf('n');
int o=str.lastIndexOf('o');
int p=str.lastIndexOf('p');
int q=str.lastIndexOf('q');
int r=str.lastIndexOf('r');
int s=str.lastIndexOf('s');
int t=str.lastIndexOf('t');
int u=str.lastIndexOf('u');
int v=str.lastIndexOf('v');
int w=str.lastIndexOf('w');
int x=str.lastIndexOf('x');
int y=str.lastIndexOf('y');
int z=str.lastIndexOf('z');

System.out.println("a  b  c  d  e  f  g  h   i   j");
System.out.println("==============================");
System.out.println(a+" " +b + " "+c+" "+d+" " +e +"  "+f + "  "+g + "  "+h+"  "+i+"  "+j+"  ");
System.out.println();
System.out.println("k  l  m  n  o  p  q  r   s   t");
System.out.println("==============================");
System.out.println(k+" " +l + " "+m+" "+n+" " +o+"  "+p+ "  "+q + "  "+r+"  "+s+"  "+t+"  ");
System.out.println();
System.out.println("u  v  w  x  y  z  ");
System.out.println("==============================");
System.out.println(u+" " +v + " "+w+" "+x+" " +y +"  "+z );

}
}