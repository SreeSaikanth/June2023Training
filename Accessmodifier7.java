class Person
{
protected String fname="John";
protected String lname="Don";
protected int age=24;
}
class Student extends Person
{
private int graduationYear=2008;
public static void main(String args[])
{
Student myObj=new Student();
System.out.println("Name:"+myObj.fname+" "+myObj.lname);
System.out.println("Age:"+myObj.age);
System.out.println("Graduation Year:"+myObj.graduationYear);
}
}

