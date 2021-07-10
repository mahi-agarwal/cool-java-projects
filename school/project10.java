// removingSpacesAndCapitalisingFirstLetters
import java.util.*;
class project10
{
    public static void main(String args[])
    {
        //accepting the input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String s= sc.nextLine();
        s= s.trim();
        s= " " + s+ " ";
        String s2= "";
        int l= s.length();
        //loop to convert to camel case
        for(int i=1; i<l; i++)
        {
            //extracting characters to check for a new word
            char c1= s.charAt(i-1);
            char c2= s.charAt(i);
            //converting first letter of a new word to upper case
            if(c1==' ')
            {
                s2= s2+ (Character.toUpperCase(c2));
            }
            //adding the edited characters to a new String
            else if(c1!=' ' && s.charAt(i-2)!=' ')
            {
                s2= s2+c1;
            }
        }
        //printing the edited String
        System.out.println(s2);
        System.out.println();
    }
}