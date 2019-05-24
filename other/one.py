class Main:
    n=input();
    i=0
    while(int(i)<int(n)):
        day=int(input());
        isw=bool(input());
        if(day in [1,7]):
            if(isw):
                print("9:00");
            elif(not(isw)):
                print("6:00");
        elif(day in [2,3,4,5,6]):
            if(isw):
                print("7:00");
            else:
                print("5:00");
        i=i+1;

   