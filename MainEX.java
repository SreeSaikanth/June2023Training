class MainEX
{
static void checkAge(int age)throws ArithmeticException
{
if(age<18)
{
throw new ArithmeticException("Access denied-You must be at least 18 years old");
}
else
{
System.out.println("Acess granted-you are old enough");
}
}
public static void main(String args[])
{
checkAge(15);
}
}