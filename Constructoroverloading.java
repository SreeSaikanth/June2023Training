class Constructoroverloading
{
int id;
String name;
int age;
Constructoroverloading(int i,String n)
{
id=i;
name=n;
}
Constructoroverloading(int i,String n,int a)
{
id=i;
name=n;
age=a;
}
void display()
{
System.out.println(id+""+name+""+age);
}
public static void main(String args[])
{
Constructoroverloading s1=new Constructoroverloading(111,"sai");
Constructoroverloading s2=new Constructoroverloading(222,"sree",21);
s1.display();
s2.display();
}
}