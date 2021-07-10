import java.util.*;
class method2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String s= sc.nextLine();
        s= s.toLowerCase();
        int l= s.length();
        int count=0;
        for(int i=0; i<l; i++)
        {
            char c= s.charAt(i);
            if(isVowel(c)==true)
            {
                count++;
            }
        }
        System.out.println("Number of vowels in the string: "+count);
        System.out.println();
    }
    public static boolean isVowel(char c)
    {
        if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
