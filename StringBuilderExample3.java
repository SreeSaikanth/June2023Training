class StringBuilderExample3
{
public static void main(String args[])
{
StringBuilder sb=new StringBuilder();
System.out.println(sb.capacity());//default 16
sb.append("hello");
System.out.println(sb.capacity());//now 16
sb.append("Java is my fav language");
System.out.println(sb.capacity());//now 16*2
}
}