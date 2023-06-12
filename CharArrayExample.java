import java.io.CharArrayReader;
public class CharArrayExample
{
public static void main(String args[])throws Exception
{
char[] ary={'s','r','e','e','s','a','i','k','a','n','t','h'};
CharArrayReader reader=new CharArrayReader(ary);
int k=0;
while((k=reader.read())!=-1)
{
char ch=(char)k;
System.out.print(ch+":");
System.out.print(k);
}
}
}