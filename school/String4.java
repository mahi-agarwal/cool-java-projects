/*Write a program to accept a string/sentence in upper case 
 *and Display the longest word and the length of the longest word present in the string*/
 import java.util.*;
 class String4
 {
     public static void main(String args[])
     {
        int count= 0, i, max=0;
        String flag= "";
        String n2= "";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string in upper case");
        String n= sc.nextLine();
        n= n+ " ";
        int l= n.length();
        //running a loop to extract characters one at a time
        for(i=0; i<=l-1; i++)
        {
            char c= n.charAt(i);
            //adding characters to form a word and find its length 
            if(c!=' ')
            {
               count++;
               flag= flag+ c; 
            }
            //comparing the lengths of words and finding the longest
            else
            {
                if(count>=max)
                {
                    max= count;
                    n2= flag;
                }
                count= 0;
                flag= "";
            }
        }
        System.out.println("Longest word: "+ n2);
        System.out.println("Length: "+ max);
        System.out.println();
    }
}