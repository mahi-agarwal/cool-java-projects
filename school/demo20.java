import java.util.*;
class demo20
{
    public static void main(String args[])
    {
        //Accepting any 3 real numbers and generate X= Product of integer portion/Sum of decimal portion
        System.out.println("Enter any 3 real numbers(Press enter after each)");
        Scanner sc= new Scanner(System.in);
        double a, b, c, a2, b2, c2, num, den, x, x2;
        int a1, b1, c1;
        a= sc.nextDouble();
        b= sc.nextDouble();
        c= sc.nextDouble();
        a1= (int)a;
        b1= (int)b;
        c1= (int)c;
        num= a1*b1*c1;
        System.out.println("Numerator "+num);
        a2= a-a1;
        b2= b-b1;
        c2= c-c1;
        den= a2+b2+c2;
        System.out.println("Denominator "+den);
        x= num/den;
        x2= Math.round(x);
        System.out.println("X= "+ x);
        System.out.println("Rounded off X= "+ x2);
        System.out.println();
    }
}