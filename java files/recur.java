class priary
{
    int[] values;
    priary(int i)
    {
        values=new int[i];
    }
    void printary(int i)
    {
       if(i==0) return;
       else
       
           printary(i-1);
           System.out.print("\t"+values[i]);
          
       
       }
    }

class recur
{
    public static void main(String args[])
    {
        priary p=new priary(10);
        for(int i=0;i<9;i++)
        {
            p.values[i]=i;
        }
        p.printary(8);
    }
}