import math;
class Solution:
    def Met(n):
        if (n==0):
            print(1);
        else:
            print(pow(2,int(math.log2(n))));