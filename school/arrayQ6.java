import java.util.Scanner;
class arrayQ6
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
            if(arr[i]==0)
            {
                for(j=i; j<n-1; j++)
                {
                    arr[j]= arr[j+1];
                }
                arr[n-1]= 0;
            }
        }
        System.out.println("Array after moving 0's at the end:");
        for(i=0; i<n; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}