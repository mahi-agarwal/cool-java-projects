//brackets
import java.util.*;
class project18
{
    public static void main(String args[])
    {
        //accepting the input
        System.out.println("Enter a string");
        Scanner sc= new Scanner(System.in);
        String n= sc.nextLine();
        //checking the index of each bracket
        int par1= n.indexOf('(');
        int par2= n.indexOf(')');
        String flag= "";
        //checking if the parentheses are in order or not, or if they are not present
        if(par2<0 || par1<0)
        {
            System.out.println("Both parentheses are not present");
        }
        else if(par1<par2)
        {
            System.out.println("The parentheses are placed correctly");
        }
        else if(par1>par2)
        {
            //adding the brackets correctly to a new edited String
            for(int i=0; i<n.length(); i++)
            {
                if(i==par2)
                {
                    flag= flag+"(";
                }
                else if(i==par1)
                {
                    flag= flag+")";
                }
                else
                {
                    flag= flag+ n.charAt(i);
                }
            }
            //printing the output
            System.out.println("The parentheses are not placed correctly");
            System.out.println("Correct placement of parentheses: "+ flag);
        }
        System.out.println();
    }
}