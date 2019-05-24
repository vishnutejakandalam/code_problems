import java.io.*;
class test
{
	int a,b,sum;
	test(int i,int j)
	{
		a=i;
		b=j;
	}
	test add()
    {
        test t1=new test(a+10,b+10);
        t1.sum=t1.a+t1.b;
        return t1;
    }
	}
    class returnobj
    {
        public static void main(String args[])
        {
            test t1=new test(1,2);
            test t2=t1.add();
            System.out.println(t1.a+t1.b+" "+t1.sum);
            System.out.println(t2.a+" "+t2.b+" "+t2.sum);
            System.out.println(t1+" "+t2);
        }
    }