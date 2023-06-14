import java.util.List;
import java.util.ArrayList;
class Main
{
public static void main(String args[])
{
List<Integer>numbers=new ArrayList<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
System.out.println("List:"+numbers);
int num=numbers.get(2);
System.out.println("Acessed elements:"+num);
int num1=numbers.remove(2);
System.out.println("removed element:"+num1);
System.out.println("List:"+numbers);

}
}
