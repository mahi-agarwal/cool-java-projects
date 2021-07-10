//pattern
import java.util.*;
class project12
{
    public static void main(String args[])
    {
        //accepting the limit to print the pattern
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a limit<=9:");
        int n= sc.nextInt();
        if(n>9)
        {
            System.out.println("Invalid value");
        }
        //printing the pattern if the limit is less than 10
        else
        {
            for(int i=1; i<=n; i++)
            {
                for(int j=1; j<=(9-i); j++)
                {
                    System.out.print('*');
                }
                for(int j=1; j<=i; j++)
                {
                    if(j==i)
                    {
                        System.out.print(i);
                    }
                    else
                    {
                        System.out.print(i + "|");
                    }
                }
                for(int j=1; j<=(9-i); j++)
                {
                    System.out.print('*');
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}