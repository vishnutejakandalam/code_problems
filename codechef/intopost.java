import java.util.Scanner;
class intopost
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char[] post;
        String in=new String(); 
        post=new char[50];
        int t;
        st op=new st();
        t=s.nextInt();
        for(int q=0;q<t;q++)
        {
            int i=0;
            int j=0;
            in=s.next();
            while(i<in.length())
            {
                System.out.println("i"+i);
                System.out.println("op.top"+op.top);
                op.display();
                System.out.println("post = "+post);
                if(Character.isLetter(in.charAt(i)))
                {
                    post[j]=in.charAt(i);
                    i++;
                    j++;
                }
                else if(in.charAt(i)==')')
                {try{
                    while(op.sta[op.top]!='(')
                    {
                        post[j++]=op.pop();
                    }
                    op.top--;
                }
                catch(Exception e){
                System.out.println("this is the place of exception");
            }}
            else if(in.charAt(i)=='(')
            {
                op.push('(');
                i++;
            }
                else 
                {
                    if(prio(in.charAt(i))>prio(op.sta[op.top]))
                    {  
                         op.push(in.charAt(i));
                         i++;
                    }
                    else if(prio(in.charAt(i))<=prio(op.sta[op.top]))
                    {
                        while(prio(in.charAt(i))>=prio(op.sta[op.top]))
                        {
                            post[j]=op.pop();
                            j++;
                        }
                        op.push(in.charAt(i));
                        i++;
                    }
                }
            }
            while(op.top!=0)
            post[j++]=op.pop();
            System.out.println(post);
        }

    }
    public static int  prio(char ch)
    {
        System.out.println(ch);
        if(ch=='#')
        return 0;
        else if(ch=='+' || ch=='-' )
        return 1;
        else if(ch=='*' || ch== '/' || ch == '%')
        return 2;
     return 0;       
    }
}
class st
{
    public int top=0;
    public char[] sta=new char[2];
    
    public void push(char c)
    {
        sta=new char[top+2];
        sta[++top]=c;
    }
    public char pop()
    {
        if(top==0)
        {
            System.err.println("INVALID STRING");
            return '#';
        }
        else
        return sta[top--]; 
    }
    public void display()
    {
        for(int i=0;i<=top;i++)
        System.out.println("st["+i+"]"+sta[i]);
    }
}