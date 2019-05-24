class mt
{
 public static void main(String args[])
 {
 Thread t=Thread.currentThread();
/*
*/t1 th=new t1();
try{
    th.join(200);
}
catch(Exception e)
{
    System.out.print(e);
}
new mut("one",1500);
new mut("two",1000);
new mut("three",500);
System.out.println(t);
t.setName("hello");
//t1 ta=new t1();
System.out.println("after changing the name"+t);
}
}
