class Solution:
    def Met(n):
        for i in range(0,2*n):
            print("#.",end="");
        print("#");  
        for row in range(1,n+1):
            for j in range(0,n-row+1):
                print("#.",end="");
            for k in range(1,4*(row-1)+3):
                print(".",end="")
            for f in range(0,n-row):
                print("#.",end="");
            print("#")
        for e in range(n-1,0,-1):
            for j in range(0,n-e+1):
                print("#.",end="");
            for k in range(1,4*(e-1)+3):
                print(".",end="");
            for f in range(0,n-e):
                print("#.",end="");
            print("#");
        for i in range(0,2*n):
            print("#.",end="");
        print("#");  
if __name__ == "__main__":
    Solution.Met(3);
    Solution.Met(4);
    print();
    Solution.Met(10);