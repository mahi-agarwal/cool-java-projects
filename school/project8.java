//to create a spoonerism out of the given string
import java.util.*;
class project8
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        //accepting the input
        System.out.println("Note: A spoonerism are words or phrases in which letters or syllables get swapped.");
        System.out.println("Enter a string with two words:");
        String s= sc.nextLine();
        int space= s.indexOf(" ");
        //separating the input String into two words
        String first= s.substring(0, space);
        String second= s.substring(space+1);
        //extracting the first character of both words
        char c1= first.charAt(0);
        char c2= second.charAt(0);
        first= first.substring(1);
        second= second.substring(1);
        //printing the spoonerism
        System.out.println(c2+ first+ " "+ c1+ second);
        System.out.println();
    }
}