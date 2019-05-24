class Solution:
    def Met(n,c):
        for i in range(0,n):
            for j in range(0,n):
                print(c,end="");
                if j != n-1:
                    if c == 'W':
                        c='B'
                    elif c == 'B':
                        c='W';
            if n % 2 ==1:
                if c == 'B':
                    c='W';
                elif c == 'W':
                    c='B';
            print();
if __name__ == "__main__":
    Solution.Met(2,'W')
    print();
    Solution.Met(3,'B')
   