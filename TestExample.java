import java.util.*;
class StringExample1
{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("my,name,is,sree");
System.out.println("Next token is:"+st.nextToken(","));
System.out.println("Next token is:"+st.nextToken(","));
System.out.println("Next token is:"+st.nextToken(","));
System.out.println("Next token is:"+st.nextToken(","));
}
}