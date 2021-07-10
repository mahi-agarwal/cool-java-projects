/*Write a program to accept a string in upper case and 
 * convert the first letter of each word to upper case*/
 import java.util.*;
 class String3
 {
     public static void main (String args[])
     {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter a string");
         String n= sc.nextLine();
         n= " "+ n;
         n= n.toLowerCase();
         int l= n.length();
         String n2= "";
         //running a loop to extract characters one at a time
         for(int i=1; i<=l-1; i++)
         {
             char ch= n.charAt(i-1);
             char ch2= n.charAt(i);
             //checking if the character is a space as it means that the next character is a new word
             if(ch==' ')
             {               
                 n2= n2+ Character.toUpperCase(ch2);
                }
             else
             {
                 n2= n2+ch2;
                }
            }
            System.out.println(n2);
            System.out.println();
        }
    }