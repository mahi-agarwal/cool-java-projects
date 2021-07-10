import java.util.Scanner;
class arrayQ5
{
    public static void main(String args[])
    {
        int i, j, temp;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter "+ n+ " numbers:");
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
        System.out.println("Minimum number: "+ arr[0]);
        System.out.println("Maximum number: "+ arr[n-1]);
        System.out.println("The difference between the maximum and minimum numbers is:");
        System.out.println((arr[n-1]- arr[0]));
        System.out.println();
    }
}