import java.util.Scanner;
public class ExtractDigit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String res="";
for(int i=0;i<=s.length()-1;i++)
{
//{res=res+s.charAt(i);	}
if(s.charAt(i)>='0'&& s.charAt(i)<='9')
{res=res+s.charAt(i);}
}


System.out.println(res);
}
}
