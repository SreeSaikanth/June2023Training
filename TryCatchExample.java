public class TryCatchExample
{
public static void main(String args[])
{
int data=50/0;//may be throw Exception
}
//handling the exception
catch(Exception e)
{
//displaying the custom message
System.out.println("Cann't divided by zero");
}
}