import java.util.*;
class demo9
{
    public static void main(String args[])
    {
        //Finding and printing the gift a customer would get based on their amount of purchase
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the code of the item");
        int c= sc.nextInt();
        System.out.println("Enter the quantity purchased");
        int q= sc.nextInt();
        System.out.println("Enter the rate of the item");
        float r= sc.nextFloat();
        float amt= r* q;
        System.out.println("The Amount of Purchase: Rs."+ amt);
        if(amt>=100 && amt<=500)
        {
            System.out.println("Gift: A key ring");
        }
        else if(amt>500 && amt<=1000)
        {
            System.out.println("Gift: A leather purse");
        }
        else if(amt>1000)
        {
           System.out.println("Gift: A pocket calculator");
        }
        System.out.println();
    }
} 