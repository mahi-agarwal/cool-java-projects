/*to check for rhyme and/or alliteration
Determines whether two words rhyme (end w/ same last 2 letters)
and/or alliterate (start with the same letter).*/
import java.util.*;
class project4
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        //accepting the two input Strings
        System.out.println("Enter two strings");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        s1= s1.toLowerCase();
        s2= s2.toLowerCase();
        int l1= s1.length();
        int l2= s2.length();
        if(l1>= 2 && l2>= 2)
        {
            //checking if both Strings rhyme (have the same last two letters)
            if(s2.endsWith(s1.substring(l1-2)))
            {
                System.out.println("The entered strings rhyme!");
            }
            else
            {
                System.out.println("The entered strings do not rhyme!");
            }
        }
        // check whether both Strings alliterate(start with the same letter)
        if(s1.charAt(0)==s2.charAt(0))
        {
            System.out.println("The entered strings alliterate!");
        }
        else
        {
            System.out.println("The entered strings do not alliterate!");
        }
        System.out.println();
    }
}