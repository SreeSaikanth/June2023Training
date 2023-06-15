class Student
{
private int id;
private String name;
}
class Example
{
public static void main(String args[])
{
Student ob=new Student();
System.out.println(ob.id+" "+ob.name);
ob.id=1234;
ob.name="sai";
System.out.println(ob.id+" "+ob.name);
}
}//here we r getting 6errors