import java.util.Scanner;
public class PalindromeString
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String n;
String rs="";
//System.out.println("Enter a string:");
n=sc.next();
n=n.toLowerCase();
int len=n.length()-1;
for(int i=len;i>=0;i--)
{	rs=rs+n.charAt(i); 	}
if(n.equals(rs))
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}


