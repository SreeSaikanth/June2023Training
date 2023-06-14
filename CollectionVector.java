import java.util.Iterator;
import java.util.Vector;
class Main
{
public static void main(String args[])
{
Vector<String>mammals=new Vector<>();
mammals.add("Dog");
mammals.add("cow");
mammals.add("lion");
String element=mammals.get(2);
System.out.println("elements at index 2:"+element);
Iterator<String>iterate=mammals.Iterator();
System.out.print("Vector:");
while(iterate.hasNext())
{
System.out.print(iterate.next());
System.out.print(",");
}
}
}

