import java.util.ArrayList;
class Main
{
public static void main(String args[])
{
ArrayList<String>animals=new ArrayList<>();
//Add elements
animals.add("dog");
animals.add("lion");
animals.add("horse");
String str=animals.get(1);
System.out.println("ArrayList:"+animals);
System.out.println("Accessing individual elements:");
for(String temp:animals)
{
System.out.print(temp);
System.out.print(",");
}
}
}
