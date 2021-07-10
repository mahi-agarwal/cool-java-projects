import java.util.*;
class method4
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer");
        int n= sc.nextInt();
        factorial(n);
        System.out.println();
    }
    public static void factorial(int x)
    {
        int f=1;
        if(x==0)
        {
            System.out.println("Factorial: 0");
        }
        else
        {
            for(int i=1; i<=x; i++)
            {
               f= f*i;
            }
            System.out.println("Factorial: "+ f);
        }
    }
}