import java.util.*;
class demo4
{
    public static void main(String args[])
    {
        //Calculate the total salary i.e. basic salary+ hra+ conveyance+ entertainment allowance
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Basic Salary");
        double basic= sc.nextDouble();
        double hra= (15*basic)/100;
        double conv= (15*basic)/100;
        double ent= (10*basic)/100;
        double total= basic+ hra+ conv+ ent;
        System.out.println("The total salary of the person is "+ total);
        System.out.println();
    }
}