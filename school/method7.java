import java.util.*;
class method7
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("1. A password must have at least eight characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits.");
        System.out.println("Input a password(You are agreeing to the above Terms and Conditions.):");
        String pswd= sc.nextLine();
        password(pswd);
        System.out.println();
    }
    public static void password(String s)
    {
        int l= s.length();
        int digit=0, letter=0;
        if(l<10)
        {
            System.out.println("Invalid password");
        }
        else
        {
            for(int i=0;i<l; i++)
            {   
                char c= s.charAt(i);
                if(Character.isDigit(c))
                {
                    digit++;
                }
                else if(Character.isLetter(c))
                {
                    letter++;
                }
                else
                {
                    System.out.println("Invalid password");
                    break;
                }
            }
            if(digit>=2 && letter>0)
            {
                System.out.println("Valid password");
            }
        }
    }
}