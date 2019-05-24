class father
{
    void show()
    {
        System.out.println("this is father");
    }
}
class son extends father
{
    void show()
    {
        System.out.println("this is son");
    }
}
class over
{
    public static void main(String[] args) {
        father f=new father();
        f.show();
        son s=new son();
        s.show();
        father fa;
        fa=s;
        fa.show();
     }
}
