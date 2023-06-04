class Student
{
int id;
String name;
Student(){id=0;
name="null";}
Student(int r,String n){
 id=r;
 name=n;
}
void displayInformation(){System.out.println(id+" "+name);}
}
class Student5{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student(111,"sai");
s1.displayInformation();
s2.displayInformation();
}
}




