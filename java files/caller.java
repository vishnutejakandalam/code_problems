class caller  implements Runnable
{
    Thread t;
    String msg;
    tbcall te;
    int i;
    caller(tbcall te,String s,int i)
    {
        this.te=te;
    msg=s;
    t=new Thread(this);
    t.start()   ;
    }
    @Override
    public void run() {
        synchronized(te)
        {
        te.callme(msg);
    }
}
}