import java.io.FileNotFoundException;
import java.io.PrintWritter;
public class TryCatchExample7
{
public static void main(String args[])
{
PrintWriter pw;
try
{
pw=new PrintWriter("jtp.txt");
pw.println("saved");
}
catch(FileNotFoundException e)
{
System.out.println(e);
}
System.out.println("File is Saved successfully");
}
}