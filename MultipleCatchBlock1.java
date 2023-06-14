import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class MultipleCatchBlock1
{
public static void main(String args[])
{
try
{
int a[]=new int [5];
a[5]=30/0;	//a[5]=30/2;
}
catch(ArithmeticException e)
{
System.out.println("Arithemetic Exception Occures");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayIndexOutOfBoundsException occurs");
}
catch(Exception e)
{
System.out.println("parent Exception Occurs");
}
System.out.println("rest of the code");
}
}