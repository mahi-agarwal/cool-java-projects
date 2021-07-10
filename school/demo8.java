import java.util.*;
class demo8
{
    public static void main(String args[])
    {
        //Calulating the wages of a security man based on his working hours in a week
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of working hours in a week");
        double H= sc.nextDouble();
        System.out.println("Enter the rate of wages per hour");
        double R= sc.nextDouble();
        double W, a;
        if(H<=40)
        {
            W= R* H;
            System.out.println("The security man's weekly wage is Rs."+ W);
        }
        else if(H>40 && H<=56)
        {
            a= R* 40;
            W= a+ 1.25*R*(H-40);
            System.out.println("The security man's weekly wage is Rs."+ W);
        }
        else if(H>56)
        {
            a= R* 40;
            a= a+ (1.25*R*16);
            W= a+ 1.5*R*(H-56);
            System.out.println("The security man's weekly wage is Rs."+ W);
        }
        System.out.println();
    }
}