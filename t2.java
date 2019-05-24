public class t2 implements Runnable
{
 Thread t;
 t2()
{
 t=new Thread(this,"runnable");
t.run();
}
 public void run()
{
 try
{
 for(int i=0;i<5;i++)
 {
 System.out.println("this is "+i+" from "+t);
t.sleep(1000);
}
}
catch(Exception e)
{
 System.out.println(e);
 }
}
}