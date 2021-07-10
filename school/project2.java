//remove consecutive characters in a string
import java.util.*;
class project2
{
    public static void main()
    {
        String s2= "";
        Scanner sc= new Scanner(System.in);
        //accepting the input
        System.out.println("Enter a string");
        String s= sc.nextLine();
        s= s+ " ";
        int l= s.length();
        //checking for consecutive characters and creating a new edited string
        for(int i=1; i<=l-1; i++)
        {
            //extracting two characters
            char c1= s.charAt(i-1);
            char c2= s.charAt(i);
            //checking if the character is repeated consecutively
            if(c1!=c2)
            {
                //adding characters without repetition to a new string
                s2= s2+c1;
            }
        }
        //printing the edited string
        System.out.println("The edited string without consecutive repetition of characters is: ");
        System.out.println(s2);
        System.out.println();
    }
}