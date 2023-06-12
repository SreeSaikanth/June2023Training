class cls extends Thread
{
public static void main(String args[])
{
cls obj=new cls();
Thread threadobj=new Thread(obj);
threadobj.start();
System.out.println("Threads inside main are very much helpful in java");
}
public void run()
{
System.out.println("Thread from overridden run method are very helpful in java");
}
}