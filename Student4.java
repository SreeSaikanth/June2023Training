class Student
{
int id;
String name;
void insertRecord(int r,String n){
id=r;
name=n;
}
void displayInformation(){
System.out.println(id+" "+name);}

}
class Student4{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
s1.insertRecord(590,"sai");
s2.insertRecord(593,"sree");
s1.displayInformation();
s2.displayInformation();
}
}




