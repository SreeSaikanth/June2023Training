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
System.out.println("Element at 1 index is:"+str);

}
}
