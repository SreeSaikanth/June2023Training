public class MultipleCatchBlock3
{
public static void main(String args[])
{
try
{
String s=null;
System.out.println(s.length());
}
catch(ArithmeticException e)
{
System.out.println("ArithmeticException occurs");
}
catch(ArrayIndexOutOfBoundException e)
{
System.out.println("ArrayIndexOutOfBoundException occurs");
}
catch(Exception e)
{
System.out.println("parent Exception occurs");
}
System.out.println("rest of the code");
}
}