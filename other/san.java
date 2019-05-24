import java.lang.Math;
class Solution
{
    public static void main(String[] args) {
        Met(32);
        Met(64);
    }
     static void Met(int n)
    {
        //System.out.println((Math.pow(2,Math.log2(n))));
        System.out.println(Math.log(n));
    }
    
}