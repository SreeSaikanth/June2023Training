class Teststringcomparision3{
public static void main(String args[])
{
String s1="sree";
String s2="sree";
String s3=new String("sree");
String s5=new String("sree");
String s4="sai";
System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s5==s3);

System.out.println(s1.equals(s4));
}
}

