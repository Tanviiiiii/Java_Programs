package loop.Switch;

import java.util.Scanner;
public class Main {
  private static float a;
  private static float b;
  private static int calc;
  public static void main(String[] args){
    System.out.println("What operation you want to perform: enter 1 to add, enter 2 to subtract, enter 3 to multiply");
    Scanner scan=new Scanner(System.in);
    calc=scan.nextInt();
    calc();
  }
  public static void calc(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter first number:");
    a=scan.nextFloat();
    System.out.println("Enter second number:");
    b=scan.nextFloat();
    if(calc==1){
      calcplus();
    }
    if(calc==2){
      calcminus();
    }
    if(calc==3){
      calctimes();
    }
    if(calc==4){
      calcdivide();
    }
  }
  public static void calcplus(){
    System.out.println(a+b);
  }
  public static void calcminus(){
    System.out.println(a-b);
  }
  public static void calctimes(){
    System.out.println(a*b);
  }
  public static void calcdivide(){
    System.out.println(a/b);
  }
}