class Solution{
    public static int[] Met(int n)
    {
        int[] arr=new int[n*n];
        int f=-1;
        for(int i=1;i<n+1;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                arr[++f]=0;
            }
            for(int k=i;k>0;k--)
            {
                arr[++f]=k;
            }
        }
 
        return(arr);
    }

    public static void main(String args[])
{
    int[] ans=Met(5);
    for(int i=0;i<ans.length;i++)
    System.out.print(ans[i]);
}
}