import java.util.Scanner;
class Input6{
public static  int add(int a,int b)
public static  int sub(int a,int b)
public static  int mul(int a,int b)
public static  int modul(int a,int b)
{
int c=a+b;
int c=a-b;
int c=a*b;
int c=a%b;
return c;
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter a number");//5
int num1;
num1=scob.nextInt();
System.out.println("Enter a number:");//7
int num2;
num2=scob.nextInt();
//5%7=5
System.out.println(num1+"+"+num2+"="+add(num1,num2));
System.out.println(num1+"-"+num2+"="+sub(num1,num2));
System.out.println(num1+"*"+num2+"="+mul(num1,num2));
System.out.println(num1+"%"+num2+"="+modul(num1,num2));
}
}