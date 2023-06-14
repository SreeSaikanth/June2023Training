class Exception
{
public static void main(String args[])
{
try
{
int a=50/0;
System.out.println("rest of the code");

}
catch(Exception e)// instead of ArithmeticException
{
System.out.println(e);
}
//System.out.println("rest of the code");
//String s=null;
//System.out.println(s.length());//null pinter exception
/*String s="abc";
int i=Integer.parseInt(s);//number formatException
*/
//int a[]=new int[5];
//a[10]=50;//Array out of boundsException
}
}