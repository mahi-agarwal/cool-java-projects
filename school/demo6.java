import java.util.*;
class demo6
{
    public static void main(String args[])
    {
        //Calculating the fine on a book depending on the number of days it was returned late 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of days after which the book was returned late");
        int n= sc.nextInt();
        if(n>=1 && n<=5)
        {
            double f= (0.40* n);
            System.out.println("The total fine is Rs. "+ f+ '0');
        }
        else if(n>=6 && n<=10)
        {
            double f= (0.65* n);
            System.out.println("The total fine is Rs. "+ f+ '0');
        }
        else if(n>10)
        {
            double f= (0.80* n);
            System.out.println("The total fine is Rs. "+ f+ '0');
        }
        System.out.println();
    }
}