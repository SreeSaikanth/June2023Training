import java.util.Scanner;
public class SumNumber1{
public static void main(String args[])
{
int a=0;
int b;
Scanner sc=new Scanner(System.in);
 b=sc.nextInt();
for(int i=1;i<=b;i++)
{
a=a+i;
}
System.out.println("Sum: " +a);
}
}