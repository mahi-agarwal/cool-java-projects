import java.util.*;
class demo5
{
    public static void main(String args[])
    {
        //Calculating and printing the commission amount and rate based on sales
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sales amount");
        double sales= sc.nextDouble();
        double comm;
        int r;
        if(0<=sales && sales<=20000)
        {
            r= 3;
            comm= (r*sales)/100;
            System.out.println("The commission amount: "+ comm);
            System.out.println("The commission rate: "+ r);
        }
        else if(20000<sales && sales<=50000)
        {
            r= 12;
            comm= (r*sales)/100;
            System.out.println("The commission amount: "+ comm);
            System.out.println("The commission rate: "+ r);
        }
        else if(sales>=50001)
        {
            r= 31;
            comm= (r*sales)/100;
            System.out.println("The commission amount: "+ comm);
            System.out.println("The commission rate: "+ r);
        }
        else
        {
            System.out.println("Invalid value");
        }
        System.out.println();
    }
}