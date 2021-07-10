//matrix multiplication
import java.util.*;
class project19
{
    public static void main(String args[])
    {
        //accepting the input
        Scanner sc= new Scanner(System.in);
        int a1,a2,b1,b2,c1,c2,d1,d2,t1,t2,t3,t4;
        System.out.println("2x2 matrix multiplication");
        System.out.println("First matrix:-");
        System.out.print("Enter first row's 2 elements separated by a space:");
        a1= sc.nextInt();
        b1= sc.nextInt();
        System.out.print("Enter second row's 2 elements separated by a space:");
        c1= sc.nextInt();
        d1= sc.nextInt();
        System.out.println("Second matrix:-");
        System.out.print("Enter first row's 2 elements separated by a space:");
        a2= sc.nextInt();
        b2= sc.nextInt();
        System.out.print("Enter second row's 2 elements separated by a space:");
        c2= sc.nextInt();
        d2= sc.nextInt();
        //multiplying the matrices
        t1= (a1*a2)+(b1*c2);
        t2= (a1*b2)+(b1*d2);
        t3= (c1*a2)+(d1*c2);
        t4= (c1*b2)+(d1*d2);
        //printing the solution
        System.out.println("Solution:");
        System.out.println("|"+ t1+ " "+ t2+ "|");
        System.out.println("|"+ t3+ " "+ t4+ "|");
        System.out.println();
    }
}