




























/*Write a program to accept name and total marks of N number of 
 *students in two single subscript arrays name[ ] and totalmarks[ ]. 
 *Calculate and print: 
 *(i) The average of the total marks obtained by N number of students. 
 *[average = (sum of total marks of all the students)/N] 
 *(ii) Deviation of each student's total marks with the average. 
 *[deviation = total marks of a student - average]*/
import java.util.Scanner;
class arrayQ2
{
    public static void main()
    {
        float total= 0, avg, dev;
        int i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n= sc.nextInt();
        String name[]= new String[n];
        float totalmarks[]= new float[n];
        for(i=0; i<n; i++)
        {
            System.out.println("Enter the name of student "+ (i+1));
            name[i]= sc.nextLine();
        }
        for(i=0; i<n; i++)
        {
            System.out.println("Enter the total marks of "+ name[i]);
            totalmarks[i]= sc.nextFloat();
            total= total+ totalmarks[i];
        }
        avg= total/n;
        System.out.println("Average: "+ avg);
        System.out.println("Deviation:");
        for(i=0; i<n; i++)
        {
            dev= totalmarks[i]-avg;
            System.out.println(name[i]+"- "+ dev);
        }
        System.out.println();
    }
}