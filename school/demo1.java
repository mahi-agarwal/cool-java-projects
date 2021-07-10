import java.util.*;
class demo1
{
    public static void main(String args[])
    {
        //Checking if the accepted number is divisible by 2 and 3 both or not
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        Double n= sc.nextDouble();
        if(n%2==0)
        {
            if(n%3==0)
            {
                System.out.println("The number is divisible by both 2 and 3");
            }
            else
            {
                System.out.println("The number is not divisible by both 2 and 3");
            }
        }
        else
        {
            System.out.println("The number is not divisible by both 2 and 3");
        }
        System.out.println();
    }
}