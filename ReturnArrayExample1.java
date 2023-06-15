import java.util.Arrays;
class ReturnArrayExample1
{
public static int[] numbers()
{
int[] arr={1,2,3,4,4};
return arr;
}
public static void main(String args[])
{
int[] a=numbers();
for(int i=0;i<a.length;i++)
System.out.print(a[i]+" ");
}
}