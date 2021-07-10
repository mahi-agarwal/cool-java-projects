//Heteromecic number i.e. the number is the product of two consecutive integers
import java.util.*;
class project1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Note: A heteromecic number is the product of two consecutive integers");
        System.out.println();
        System.out.println("Enter a number");
        //accepting the input
        int n= sc.nextInt();
        int i, j, flag=0;
        System.out.println();
        //loop to check if input is a product of two consecutive integers
        for(i=1; i<=n/2; i++)
        {
            //checking for factor
            if(n%i==0)
            {
                j= n/i;
                //flag will be equal to 1 if input is a product of consecutive integers
                if(i+1==j || j+1==i)
                {
                    flag= 1;
                }
            }
        }
        //printing the output according to value of flag variable
        if(flag==1)
        {
            System.out.println("The given number is a heteromecic number");
        } 
        else
        {
            System.out.println("The given number is not a heteromecic number");
        }
        System.out.println();
    }
}