import java.util.Scanner;
class arraysearch
{
    public static void main(String args[])
    {
        int flag=0, a=0, i;
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[5];
        System.out.println("Enter 5 integers");
        for(i=0; i<5; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.print("Search: ");
        int n= sc.nextInt();
        for(i=0; i<5; i++)
        {
            if(arr[i]==n)
            {
                flag= -1;
                a= i;
            }
        }
        if(flag==-1)
        {
            System.out.println("The given number is present in the array at index "+ a);
        }
        else
        {
            System.out.println("The given number is not present in the array");
        }
        System.out.println();
    }
}