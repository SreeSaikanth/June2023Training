import java.util.Scanner;
public class Fact1{
public static void main(String args[])
{
int a=1;
int b;
Scanner sc=new Scanner(System.in);
 b=sc.nextInt();
for(int i=1;i<=b;i++)
{
a=a*i;
}
System.out.println(b+ "factorial is: " +a);
}
}