/*Write a program to accept a string in upper case 
 *and find the frequency of each vowel present*/
 import java.util.*;
 class String2
 {
     public static void main(String args[])
     {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter a string in upper case"); 
         String n= sc.nextLine();
         int l= n.length();
         int a=0, e=0, i=0, o=0, u=0;
         //running a loop to extract characters one at a time
         for(int j=0; j<=l-1; j++)
         {
             char ch= n.charAt(j);
             //testing the extracted character for a vowel and adding a unit to its respective variable
             if(ch=='A')
             {
                 a++;
             }
             if(ch=='E')
             {
                 e++;
             }
             if(ch=='I')
             {
                 i++;
             }
             if(ch=='O')
             {
                 o++;
             }
             if(ch=='U')
             {
                 u++;
             }
            }
            System.out.println("A= "+ a);
            System.out.println("E= "+ e);
            System.out.println("I= "+ i);
            System.out.println("O= "+ o);
            System.out.println("U= "+ u);
            System.out.println();
        }
    }