class Array
{
    public static void main(String[] args) {
        char c='\n';
                int a[];
       a=new int[5];
       for(int i=0;i<5;i++)
            a[i]=i;
            int i;
       for(i=0;i<5;i++)
       System.out.println(i);     
       int[][] a1,a2;
       a1=new int[2][2];
       a2=new int[3][];
        int j;
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            a1[i][j]=j*i;
        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            System.out.print(a1[i][j]);
            System.out.print("\n");
        }
        a2=new int[3][];
        a2[0]=new int[1];
        a2[1]=new int[2];
        a2[2]=new int[3];
        System.out.println(a2[0][0]);
        for(i=0;i<2;i++)
        {
            System.out.print(a2[1][i]);
        }
        System.out.print("\n");
        for(i=0;i<3;i++)
        {
            System.out.print(a2[2][i]);
        }
    int frnd[][][]=new int[2][][];
    frnd[0]=new int[2][2];
    frnd[1]=new int[2][2];
    int k;
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            for(k=0;k<2;k++)
        frnd[i][j][k]=i+j+k;
        }
    }
    System.out.print(c);
    for(int f[][]:frnd)
    {
        for(int g[]:f)
        {
            for(int h:g)
        System.out.print(h);
        System.out.print(c);
    }
    System.out.print(c);
}
    }   
} 