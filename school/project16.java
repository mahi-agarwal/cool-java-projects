//anagram
import java.util.Scanner;
class project16
{
    public static void main(String srgs[])
    {
        //accepting the input
        Scanner sc= new Scanner(System.in);
        System.out.println("Note: An anagram is a word, phrase, or name formed by rearranging the letters of another");
        System.out.println("Enter two strings");
        String n1= sc.nextLine();
        String n2= sc.nextLine();
        n1= n1.toLowerCase();
        n2= n2.toLowerCase();
        int l1= n1.length();
        int l2= n2.length();
        int[] counter1= new int[256];
        int[] counter2= new int[256];
        int flag= 0;
        //recording the frequency of characters in String 1
        for(int i=0; i<l1; i++)
        {
            char c= n1.charAt(i);
            if(c!=' ')
            {
                counter1[(int)c]++;
            }
        }
        //recording the frequency of characters in String 2
        for(int i=0; i<l2; i++)
        {
            char c= n2.charAt(i);
            if(c!=' ')
            {
                counter2[(int)c]++;
            }
        }
        //checking which frequencies of both Strings are equal
        for(int i=0; i<256; i++)
        {
            if(counter1[i]==counter2[i])
            {
                flag++;
            }
        }
        //the Strings are anagrams if all frequencies matched
        if(flag==256)
        {
            System.out.println("The two strings are anagrams.");
        }
        else
        {
            System.out.println("The two strings are not anagrams.");
        }
        System.out.println();
    }
}