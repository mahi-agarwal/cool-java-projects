import java.util.Scanner;
class arrayQ4
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of both arrays");
        int n= sc.nextInt();
        int arr1[]= new int[n];
        int arr2[]= new int[n];
        System.out.println("Enter "+ n+ " elements of array 1:");
        for(int i=0; i<n; i++)
        {
            arr1[i]= sc.nextInt();
        }
        System.out.println("Enter "+ n+ " elements of array 2:");
        for(int i=0; i<n; i++)
        {
            arr2[i]= sc.nextInt();
        }
        System.out.println("Common elements are:");
        for(int i=0; i<n; i++)
        {
             for(int j=0; j<n; j++)
             {
                 if(arr1[i]==arr2[j])
                 {
                     System.out.print(arr1[i]+ " ");
                 }
             }
        }
        System.out.println();
    }
}