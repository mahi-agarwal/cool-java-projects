/*Write a program in java to accept a name containing
 *three words and display the surname
 *first followed by the first and middle names*/
 import java.util.*;
 class String1
 {
     public static void main(String args[])
     {
         System.out.println("Enter a three part name");
         Scanner sc= new Scanner(System.in);
         String name= sc.nextLine();
         int l= name.length();
         name= name.trim();
         int s= name.indexOf(' ');
         //extracting the first name from zero index to the first space
         String first= name.substring(0,s);
         int s2= name.lastIndexOf(' ');
         //extracting the middle name from the first space to the last space between middle and last name
         String middle= name.substring(s+1,s2);
         //extracting the last name from index of the last space
         String last= name.substring(s2+1);
         System.out.println(last+ " "+ first+ " " + middle);
         System.out.println();
        }
    }