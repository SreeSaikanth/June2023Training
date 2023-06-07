import java.util.Scanner;
public class PalindromeString1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String n;
String rs="";
//System.out.println("Enter a string:");
n=sc.next();
String temp="";
int ascii;
//n=n.toLowerCase();
int len=n.length()-1;
for(int i=len;i>=0;i--)
{	
if(n.charAt(i)>='A'&& n.charAt(i)<='Z')
{ascii=n.charAt(i);
ascii+=32;
temp=temp+(char)ascii;
}

else
{temp=temp+n.charAt(i);}
}
System.out.println("temp:"+temp);
n=temp;
String rev="";
for(int i=n.length()-1;i>=0;i--){rev=rev+n.charAt(i);}
if(n.equals(rev))
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}
