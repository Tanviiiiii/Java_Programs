package stringexamples;

/* Write a Java program to print current date and time in the specified format. 
Sample Output:

Current Date and Time :                                                                                  
  June 19, 2017                                                                                     
 3:13 pm   */

import java.util.Calendar;
class CurrDate
{
public static void main(String []args)
{
Calendar cal=Calendar.getInstance();
System.out.println();

System.out.println("The Current Date and Time: "+ cal.getTime());
System.out.println("The Current Date : "+ cal.get(Calendar.DATE));
System.out.println("The Current Year: "+ cal.get(Calendar.YEAR));

}
}

/*
public static Calendar getInstance():
========================
This method is used with calendar object to get the instance of calendar according to current time zone set by java runtime environment
*/