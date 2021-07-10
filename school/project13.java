/*  *       *
    **     **    
    ***   ***     
    **** ****       
    ***   ***      
    **     **     
    *       *
*/
import java.util.*;
class project13
{
    public static void main(String args[])
    {
        //accepting the input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int n= sc.nextInt();
        int flag= n;
        int x= n;
        if(n%2==0)
        {
            n= n-1;
        }
        //printing the pattern
        for(int i=1; i<=((n/2)+1); i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print('*');
            }
            for(int j=flag; j>0; j--)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print('*');
            }
            flag= flag-2;
            System.out.println();
        }
        if(x%2==0)
        {
            flag= 4;
        }
        else
        {
            flag= 3;
        }
        for(int i=(n/2); i>0; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print('*');
            }
            for(int j=flag; j>0; j--)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print('*');
            }
            flag= flag+2;
            System.out.println();
        }
        System.out.println();
    }
}