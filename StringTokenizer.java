import java.util.StringTokenizer;
class StringExample
{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("my name is sree"," ");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
}