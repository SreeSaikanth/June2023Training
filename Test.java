import java.util.Scanner;
class Test{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int num=sc.nextInt();
int c=sc.nextInt();
for(int i=0;i<=num;i=i+c)

{
System.out.print(i);
if(i<num)
{
System.out.print(",");
}

}}}