/*Write a program to input a string in upper case 
 * and replace all the vowels with Asterisk(*) present in the string*/
import java.util.*;
class String5
{
    public static void main(String args[])
    {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter a string in upper case"); 
         String n= sc.nextLine();
         String n2= "";
         int l= n.length();
         //running a loop to extract characters one at a time
         for(int j=0; j<=l-1; j++)
         {
             char ch= n.charAt(j);
             //checking the character for a vowel and replacing the vowel with *
             if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
             {
                 n2= n2+'*';
                }
                else
                {
                    n2= n2+ch;
                }
            }
            System.out.println(n2);
            System.out.println();
        }
    }