/*Write a program in Java to store 10 numbers in a Single Dimensional Array 
 *(SDA). Display the numbers which are prime.*/
import java.util.Scanner;
class arrayQ1
{
    public static void main(String args[])
    {
        int p=0, i, j;
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[10];
        for(i=0; i<10; i++)
        {
            System.out.println("Enter the element number: "+ i);
            arr[i]= sc.nextInt();
        }
        System.out.println("The prime numbers are:");
        for(i=0; i<10; i++)
        {
            for(j=2; j<=arr[i]/2; j++)
            {
                if(arr[i]%j==0)
                {
                    p++;
                }
            }
            if(p<=0)
            {
                System.out.println(arr[i]);
            }
            p= 0;
            System.out.println();
        }
    }
}