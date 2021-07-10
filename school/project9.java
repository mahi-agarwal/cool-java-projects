//to prime factorise a number
import java.util.*;
class project9
{
    public static void main(String args[])
    {
        //accepting the input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        System.out.println("Prime factorisation:");
        int flag= n;
        System.out.print("1 ");
        //printing the prime factors
        for(int i=2; i<=flag/2; i++)
        {
            while(n%i==0)
            {
                System.out.print("x "+ i + " ");
                n= n/i;
            }
        }
        System.out.println();
    }
}