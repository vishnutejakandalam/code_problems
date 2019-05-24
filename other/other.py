class Solution:
    def Met(n):
        z=0;
        c=5;
        while int(n/c) > 0:
            z=z+int(n/c)
            c=c*5;
        print(z);
if __name__ == "__main__":
    Solution.Met(15);
    Solution.Met(10);
    Solution.Met(5);
    Solution.Met(4);