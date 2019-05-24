class Solution:
    def Met(n):
        m=int(2*n+1);
        for t in range(1,m+1):
            if t <= int(m/2):
                s=2*t;
                d=m-s;
                for st in range(1,int(s/2)+1):
                    print("*",end="");
                for dt in range(1,d+1):
                    print(".",end="");
                for st in range(1,int(s/2)+1):
                    print("*",end="");
                print();
            elif t == int(m/2+1):
                for k in range(0,m):
                    print("*",end="");
                print();
            elif t > int(m/2+1):
                s=2*n;
                d=m-s;
                for st in range(int(s/2)+1,1,-1):
                    print("*",end="");
                for dt in range(d+1,1,-1):
                    print(".",end="");
                for st in range(int(s/2)+1,1,-1):
                    print("*",end="");
                n-=1;
                print();

if __name__ == "__main__":
    Solution.Met(3);
    Solution.Met(5);
    Solution.Met(1);