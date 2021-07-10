//alternating upper case in a string
import java.util.*;
class project3
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        //accepting the input 
        System.out.println("Enter a string");
        String s= sc.nextLine();
        int l= s.length();
        String s2= "";
        //loop to convert String to toggle case one character at a time
        for(int i=0; i<=l-1; i++)
        {
            //extracting a character
            char c= s.charAt(i);
            //converting even index character to lower case and odd index to lower case
            if(i%2==0)
            {
                c= Character.toLowerCase(c);
            }
            else
            {
                c= Character.toUpperCase(c);
            }
            //adding the character to a new String
            s2= s2+ c;
        }
        //printing the edited String
        System.out.println("The toggle string is:");
        System.out.println(s2);
        System.out.println();
    }
}