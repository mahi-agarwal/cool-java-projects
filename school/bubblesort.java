//ascending order
import java.util.Scanner;
class bubblesort
{
    public static void main(String args[])
    {
        int i, j, temp;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter "+ n+ " numbers");
        for(i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
        for(i=0; i<n; i++)
        {
            for(j=1; j<(n-i); j++)
            {
                if(arr[j-1]>arr[j])
                {
                    //swap elements
                    temp= arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        System.out.println("Array after Bubble Sort in ascending order:");
        for(i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}