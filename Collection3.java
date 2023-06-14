import java.util.List;
import java.util.LinkedList;
class Main
{
public static void main(String args[])
{
List<Integer>numbers=new LinkedList<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
System.out.println("List:"+numbers);
int num=numbers.get(2);
System.out.println("Acessed elements:"+num);
int index=numbers.indexOf(2);
System.out.println("Posiion of 2 is"+index);
int removedNum=numbers.remove(1);
System.out.println("List:"+numbers);

}
}
