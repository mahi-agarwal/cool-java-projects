import java.util.*;
class method5
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer");
        int n= sc.nextInt();
        System.out.println("Sum of digits: "+ sumOfDigits(n));
        System.out.println();
    }
    public static int sumOfDigits(int x)
    {
        int sum=0, d;
        while(x>0)
        {
            d= x%10;
            sum= sum+d;
            x= x/10;
        }
        return sum;
    }
}