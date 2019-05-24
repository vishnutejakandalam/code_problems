public class t1 extends Thread
{
 t1()
 {
 super("t1");
 start();
}
public void run()
{
try
{
 System.out.println("child thread before sleep"); 
sleep(500);
System.out.println("child thread after sleep");
}
catch(Exception e)
{
System.out.println("hello world");
}
}
}