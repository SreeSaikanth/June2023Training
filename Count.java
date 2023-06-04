import java.util.Scanner;
public class Count{
public static void main(String args[])
{
int count=0;
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();

{
for (int i=0;i<=str.length()-1;i++)
count++;
}
{
System.out.print(count);
}
}
}
