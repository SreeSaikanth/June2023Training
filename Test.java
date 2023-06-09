import java.io.*;
import java.util.*;
class c
{
static boolean isNumber(String s)//return true if s is number else false
{
for (int i=0;i<s.length();i++)
{
if(Character.isDigit(s.charAt(i))==false)
{return false;}
}
return true;
}//is number
 public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
String str=sc.next();
//fuction returns 1 if all elements are in range'0-9'
if(isNumber(str))
System.out.println("integer");
//function returns 0 if the input is not an integer
else
System.out.println("String");
}
}
