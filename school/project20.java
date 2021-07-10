//AP 
import java.util.*;
class project20
{
    public static void main(String args[])
    {
        //accepting the input
        Scanner sc= new Scanner(System.in);
        System.out.println("Arithmetic Progression Menu: 1.N th term;  2.Sum of A.P.;  3.Generate A.P.");
        int i= sc.nextInt();
        System.out.println("Enter first three terms of A.P.");
        int a1= sc.nextInt();
        int a2= sc.nextInt();
        int a3= sc.nextInt();
        int d= a2-a1;
        int n;
        //checking if the input sequence is an AP
        if(d!=(a3-a2))
        {
            System.out.println("Not an Arithmetic Progression");
        }
        else
        {
            //calculating the solution according to the user's option
            switch(i)
            {
                case 1:
                System.out.print("Enter the position of term to be calculated: ");
                n= sc.nextInt();
                int an= a1+(n-1)*d;
                System.out.println("N th term= "+an);
                break;
                
                case 2:
                System.out.println("Enter number of terms in A.P.");
                n= sc.nextInt();
                int l= a1+(n-1)*d;
                float s= (n*(a1+l))/2;
                System.out.println("Sum of A.P.= "+s);
                break;
                
                case 3:
                System.out.println("Enter number of terms in A.P.");
                n= sc.nextInt();
                System.out.print("A.P.= "+a1+" ");
                for(int j=1; j<n; j++)
                {
                    int t= a1+(d*j);
                    System.out.print(t+" ");
                }
                break;
                
                default:
                System.out.println("Invalid value");
            }
        }
        System.out.println();
    }
}