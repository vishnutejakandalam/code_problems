class innerdemo
{
    public static void main(String args[])
    {
        int x=10;
        class outer
        {
            int y=20;
            void test()
            {
                System.out.println(x);
            }
        }
        outer o=new outer();
        o.test();
        System.out.println(" "+o.y);
    }
}