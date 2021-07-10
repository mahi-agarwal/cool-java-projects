//Write a program to print lcm and/or hcf of two numbers
import java.util.*;
class project11
{
    public static void main(String args[])
    {
        //accepting the input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two positive integers:");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        System.out.println("Enter an option; 1. HCF, 2. LCM");
        int opt= sc.nextInt();
        int hcf= 1;
        int flag= (n1<n2)? n1:n2;
        //taking out the HCF irrespective of choice of user
        for(int i=flag; i>0; i--)
        {
            if(n1%i==0 && n2%i==0)
            {
                hcf= i;
                break;
            }
        }
        //using switch case to print output
        switch(opt)
        {
            case 1: 
            System.out.println("HCF= "+ hcf);
            break;
            
            //using HCF to find LCM
            case 2: int lcm= (n1*n2)/hcf;
            System.out.println("LCM= "+ lcm);
            break;
            
            default:
            System.out.println("Invalid entry");
        }
        System.out.println();
    }
}