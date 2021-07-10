import java.util.*;
class demo14
{
    public static void main(String args[])
    {
        //Check whether all digits in a number are odd, even or both
        int e=0, o=0, n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        n= sc.nextInt();
        while(n>0)
        { 
            int d= n%10;
            if(d%2==0)
            {
                e= e+1;
            }
            else
            {
                o= o+1;
            }
            n= n/10;
        }
        if(e>0 && o==0)
        {
            System.out.println("All digits in the given number are even");
        }
        else if(e==0 && o>0)
        {
            System.out.println("All digits in the given number are odd");
        }
        else
        {
            System.out.println("The digits in the given number are both odd and even");
        }
        System.out.println();
    }
}