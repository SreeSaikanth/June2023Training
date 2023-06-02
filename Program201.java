import java.util.*;
public class Program201{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter a number:");
n=sc.nextInt();
if(n%2==0)
{
System.out.print("even\n");
System.out.print(n+"is Even\n");
}
else
{
System.out.print("odd");
}
}
}