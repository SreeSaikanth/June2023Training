public class TryCatchExample1
{
public static void main(String args[])
{
int i=50;
int j=0;
int data;//may be throw Exception
try
{
data=i/j;
}
//handling the exception
catch(Exception e)
{
//displaying the custom message
System.out.println(i/(j+2));
}
}
}