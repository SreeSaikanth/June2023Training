class Task1 extends Thread
{
String threadName;
public Task1(String name){threadName=name;}
public void run()
{
if(Thread.currentThread().isDaemon())
{
System.out.println(threadName+"is Daemon Thread");
}
else
{
System.out.println(threadName+"is User Thread");
}
}
public static void main(String args[])
{
Task1 thread1=new Task1("thread1");
Task1 thread2=new Task1("thread2");
thread1.setDaemon(true);
thread1.start();
thread2.start();
}
}


