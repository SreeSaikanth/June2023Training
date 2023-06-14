import java.util.Vector;
class Main
{
public static void main(String args[])
{
Vector<String>mammals=new Vector<>();
mammals.add("Dog");
mammals.add("cow");
mammals.add(2,"lion");
System.out.println("vector:"+mammals);
Vector<String>animals=new Vector<>();
animals.add("crocodile");
animals.addAll(mammals);
System.out.println("new vector:"+animals);
}
}

