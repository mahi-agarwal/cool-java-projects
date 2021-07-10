//to check for a strong password 
import java.util.*;
class project7
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        //accepting the input
        System.out.println("Enter the password:");
        String pw= sc.nextLine();
        int l= pw.length();
        int num= 0, lower=0, upper=0, special=0;
        //checking if the input is of a valid length
        if(l<6)
        {
            System.out.println("!Not a strong password!");
            System.out.println("At least 6 characters should be present");
        }
        //checking if the input has the necessary requirements
        else
        {
            for(int i=0; i<l; i++)
            {
                char c= pw.charAt(i);
                if(Character.isLetter(c))
                {
                    if(Character.isLowerCase(c))
                    {
                        lower++;
                    }
                    else
                    {
                        upper++;
                    }
                }
                else if(Character.isDigit(c))
                {
                    num++;
                }
                else
                {
                    special++;
                }
            }
            //printing the output according to how the input fulfils the requirements
            if(lower>0 && upper>0 && num>0 && special>0)
            {
                System.out.println("!Strong password!");
            }
            else
            {
                System.out.println("!Not a strong password!");
                if(lower<=0)
                {
                    System.out.println("At least one lower case character should be present");
                }
                if(upper<=0)
                {
                    System.out.println("At least one upper case character should be present");
                }
                if(num<=0)
                {
                    System.out.println("At least one number should be present");
                }
                if(special<=0)
                {
                    System.out.println("At least one special character should be present");
                }
            }
        }
        System.out.println();
    }
}