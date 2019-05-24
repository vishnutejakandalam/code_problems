class Solution:
    def Met(n):
        count=0;
        if n <= 0:
            print("Not Prime");
        else:
            for i in range(2,n):
                if n%i == 0:
                    count+=1;
                if count == 1:
                    break;
            if count ==0:
                print("Prime");
            else:
                print("Not Prime");
if __name__ == "__main__":
    Solution.Met(-5);
    Solution.Met(7);
    Solution.Met(1);
    Solution.Met(16);
