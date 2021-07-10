/* Accept M numbers in a single dimensional array arr[M]. 
 * Transfer and store all the even numbers in an array even[ ]
 * and all the odd numbers in another array odd[ ].
 * Finally, print the elements of both the arrays. */  
import java.util.Scanner;
class arrayQ3
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of numbers to be accepted");
        int m= sc.nextInt();
        int numbers[]= new int[m];
        int even[]= new int[m];
        int odd[]= new int[m];
        for(int i=0; i<m; i++)
        {
            System.out.println("Enter the element number: "+ i);
            numbers[i]= sc.nextInt();
        }
        for(int i=0; i<m; i++)
        {
            if(numbers[i]%2==0)
            {
                even[i]= numbers[i];
            }
            else
            {
                odd[i]= numbers[i];
            }
        }
        System.out.println("Even: ");
        for(int i=0; i<m; i++)
        {
            if(even[i]!=0)
            {
                System.out.println(even[i]);
            }
        }
        System.out.println("Odd: ");
        for(int i=0; i<m; i++)
        {
            if(odd[i]!=0)
            {
                System.out.println(odd[i]);
            }
        }
        System.out.println();
    }
}