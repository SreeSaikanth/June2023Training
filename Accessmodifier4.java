class Student
{
public int id;
public String name;
private void display()
{
System.out.println(this.id+" "+this.name);
}
}
class Example
{
public static void main(String args[])
{
Student ob=new Student();
ob.id=1234;
ob.name="sai";
ob.display();
}
}