/*Write a program to accept two different 
 * characters and display the sum and difference
 * of their ASCII values*/ 
import java.util.*;
class ascii
{
    public static void main(String args[])
    {
        System.out.println("\n");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a character");
        //accepting characters
        char ch1= sc.next().charAt(0);
        char ch2= sc.next().charAt(0);
        //Storing the ASCII values
        int a= (int)ch1;
        int b= (int)ch2;
        int sum= a+b;
        int diff= a-b;
        System.out.println("The sum of ASCII values= "+ sum);
        System.out.println("The difference of ASCII values= "+ diff);
        System.out.println();
    }
}
