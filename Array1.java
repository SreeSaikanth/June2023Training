class Array1
{
public static void main(String args[])
{
int[] numbers={21,16,17,20,45,3,43,23,12,-7};//create an array
for(int number:numbers){
 int sum+=number;
}
int arrayLength=numbers.length;
 double average=((double)sum/(double)arrayLength);
System.out.println("sum= "+sum);
System.out.println("average= "+average);
}
}
