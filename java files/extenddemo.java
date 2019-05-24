class box
{
    int length;
    int width;
    int height;
    box(){
        length=10;
        width=20;
        height=30;
    }
    void show()
    {
        System.out.println(length+width+height);
    }
}
class cbox extends box
{
    public int color;
    cbox()
    {
        color=15;
        length=10;
        width=20;
        height=30;
    }
    void show()
    {
        System.out.println("the extended class "+length+" "+width+" "+height+" "+color);
    }
}

class extenddemo
{
    public static void main(String[] args) {
        box b=new box();
        cbox c=new cbox();
        b.show();
        c.show();
        box be;
        be=c;
        be.show();
    }
}