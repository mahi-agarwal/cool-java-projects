import java.util.*;
class demo2a
{
    public static void main(String args[])
    {
        //using if statement to accept three numbers and find the greatest
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers(Press enter after each)");
        Double a= sc.nextDouble();
        Double b= sc.nextDouble();
        Double c= sc.nextDouble();
        if(a>b && a>c)
        {
            System.out.println("The greatest number is "+ a);
        }
        if(b>a && b>c)
        {
            System.out.println("The greatest number is "+ b);
        }
        if(c>a && c>b)
        {
            System.out.println("The greatest number is "+ c);
        }
        System.out.println();
    }
}