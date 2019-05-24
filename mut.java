public class mut implements Runnable
{
  long dt=0;
 Thread t; 
public String sname; 
 mut(String name,long dt)
 {
 t=new Thread(this,name);  
sname=name;
this.dt=dt;
System.out.print(dt);

   t.run();
 }
 public void run()
{
  try
{
 System.out.println("thread"+sname);
 for(int i=12;i<20;i++)
 {
 System.out.println(sname+" : "+i);
 t.sleep(dt);
}
}
catch(Exception e)
{
 System.out.println(e);
}
}
}