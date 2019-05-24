class Main:
    n=int(input());
    v=64;
    k=0;
    for t in range(0,n):
        m=int(input());
        for i in range(0,m+1):
            for k in range(0,i):
                print(chr(v+i),end="");
            if i == 0:
                continue;
            print();
