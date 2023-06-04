import java.util.Scanner;
class Testa{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int num=sc.nextInt();
int c=sc.nextInt();
String str="";
for(int i=0;i<=num;i=i+c)
{
str=str+i+",";
}
for(int i=0;i<str.length()-1;i++)System.out.print(str.charAt(i));
}
}