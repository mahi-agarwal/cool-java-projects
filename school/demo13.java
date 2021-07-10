import java.util.*;
class demo13
{
    public static void main(String args[])
    {
        //Printing perfect numbers upto 1000
        int i, a, k=0, n;
        System.out.println("Perfect numbers upto 1000:");
        for(n=1; n<=1000; n++)
        {
            for(i=1; i<=n/2; i++)
            {
                a= n%i;
                if(a==0)
                {
                    k= k+i;
                }
            }
            if(k==n)
            {
                System.out.println(n);
            }
            k=0;
        }
        System.out.println();
    }
}