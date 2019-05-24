class calling
{
    public static void main(String[] args) {
        tbcall te=new tbcall();
        caller c1=new caller(te,"my",1);//to
        caller c2=new caller(te,"to",2);//java
        caller c3=new caller(te,"java",3); //hai
        caller c4=new caller(te,"hai",4); //my
        try{
        c1.t.join();
        c2.t.join();
        c3.t.join();
        c4.t.join();
    }
    catch(InterruptedException e)
    {
        System.out.print(e);
    }
}
}