import java.util.Scanner;
public class Factors
{
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
for(int i=1;i<=a;i++)
{
if(a%i==0)
{
System.out.print(i);


if(i<a)
System.out.print(",");
}
}
}
}