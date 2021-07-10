import java.util.*;
class demo12
{
    public static void main(String args[])
    {
        //Checking whether a number is a perfect number i.e. equal to the sum of its factors except itself
        int i, a, k=0;
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
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
            System.out.println("The entered number is a perfect number");
        }
        else
        {
            System.out.println("The entered number is not a perfect number");
        }
        System.out.println();
    }
}