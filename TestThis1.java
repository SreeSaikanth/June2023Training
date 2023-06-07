class Student
{
int rollno;
String name;
float fee;
Student(int r,String n,float f)
{
rollno=r;
name=n;
fee=f;
}
void display()
{
System.out.println(rollno+""+name+""+fee);
}
}
class TestThis1
{
public static void main(String args[])
{
Student s1=new Student(111,"sai",100000f);
Student s2=new Student(113,"sree",90000f);
s1.display();
s2.display();
}
}
