class Student
{
int rollno;
String name,course;
float fee;
Student(int rollno,String name,String course)
{
this.rollno=rollno;
this.name=name;
this.course=course;
}
Student(int rollno,String name,String course,float fee)
{
//this.fee=fee;
this(rollno,name,course);
this.fee=fee;

}



void display()
{
System.out.println(rollno+" "+name+" "+course+" "+fee);
}
}
class TestThis6
{
public static void main(String args[])
{
Student s1=new Student(111,"sai","java");
Student s2=new Student(111,"sai","java,2000f");
s1.display();
s2.display();
}
}
