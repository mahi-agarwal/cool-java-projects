import java.util.*;
class demo2b
{
    public static void main(String args[])
    {
        //using ternary operator to accept three numbers and find the greatest
        Double max=0.0;
        System.out.println("Enter three numbers(Press enter after each)");
        Scanner sc= new Scanner(System.in);
        Double a= sc.nextDouble();
        Double b= sc.nextDouble();
        Double c= sc.nextDouble();
        max= (a>=b && a>=c)? a:max;
        max= (b>=a && b>=c)? b:max;
        max= (c>=a && c>=b)? c:max;
        System.out.println("The greatest number is "+ max);
        System.out.println();
    }
}