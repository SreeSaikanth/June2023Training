import java.util.Scanner;
class Input4{
public static  int sub(int a,int b)
{
int c=a-b;
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
//5-7=-2
System.out.println(num1+"-"+num2+"="+sub(num1,num2));
}
}