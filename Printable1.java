interface printable1
{
void print();
}
interface Showable
{
void show();
}
class A implements printable,Showable
{
public void print(){System.out.println("Hello");}
public void show(){System.out.println("Welcome");}
public static void main(String args[])
{
A obj=new A();
obj.print();
obj.show();
}
}