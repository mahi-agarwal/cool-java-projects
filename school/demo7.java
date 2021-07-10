import java.util.*;
class demo7
{
    public static void main(String args[])
    {
        //Calculating the monthly messaging a
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of message units");
        int MESSAGE= sc.nextInt();
        System.out.println("Enter the customer registration number");
        int CUSTNO= sc.nextInt();
        double amnt, a, b;
        System.out.println("CUSTOMER NO.: " + CUSTNO);
        System.out.println("MESSAGE UNITS: " + MESSAGE);
        if(MESSAGE<=80)
        {
            amnt= 250.0;
            System.out.println("AMOUNT(Rs.): " + amnt); 
        }
        else if(MESSAGE>80 && MESSAGE<=140)
        {
            amnt= 250+(0.60*(MESSAGE-80));
            System.out.println("AMOUNT(Rs.): " + amnt); 
        }
        else if(MESSAGE>140 && MESSAGE<=200)
        {
            a= 250+(0.60* 60);
            amnt= a+ (0.50*(MESSAGE-140));
            System.out.println("AMOUNT(Rs.): " + amnt); 
        }
        else if(MESSAGE>200)
        {
            a= 250+(0.60* 60)+ (0.50* 60);
            amnt= a+ (0.40*(MESSAGE-200));
            System.out.println("AMOUNT(Rs.): " + amnt); 
        }
        System.out.println();
    }
}