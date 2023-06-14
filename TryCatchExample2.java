public class TryCatchExample2
{
public static void main(String args[])
{

try
{
int data=50/0;
}
//handling the exception
catch(ArithemeticException e)
{
int data1=50/0;
}
System.out.println("rest of the code..");
}
}