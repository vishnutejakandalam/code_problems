class Solution:
    def Met(n):
        for i in range(0,n):
            d=i;
            s=n-i;
            for m in range(0,d):
                print(".",end="");
            for o in range(0,s):
                print("*",end="");
            print();
if __name__ == "__main__":
    Solution.Met(5);
    Solution.Met(4);
    Solution.Met(3);
    Solution.Met(0);