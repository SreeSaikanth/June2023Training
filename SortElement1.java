import java.util.Scanner;
import java.util.Arrays;
class SortElement1
{
public static void main(String args[])
{
int n,i=0;
int sum=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter no.of elements you want in array:");
n=s.nextInt();
int a[]=new int [n];
System.out.println("Enter all the elements:");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a);
for(int j:a) System.out.print(j+" ");

System.out.println("\n"+a[0]+" "+a[n-1]);
for(int y:a){sum+=y;}
float avg=(float)sum/n;
System.out.println(sum+"\n"+avg);
System.out.println("second largest is:"+a[n-2]);
}
}

