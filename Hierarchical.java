class C
{
public void disp()
{
System.out.println("method of class");
}
}
class A extends C
{
public void disp()
{
System.out.println("method of class A");
}
}
class B extends C
{
public void disp()
{
System.out.println("method of B");
}
}
class Hierarchical extends A
{
public void disp()
{System.out.println("method class D");}

public static void main(String args[])
{
Hierarchical b=new Hierarchical();
b.disp();
}
}