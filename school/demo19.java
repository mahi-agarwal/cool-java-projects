import java.util.*;
class demo19
{
    public static void main(String args[])
    {
        //Menu driven program to calculate area and perimeter of a triangle, rectangle, paralellogram and trapezium
        System.out.println("Select a number to calculate area and perimeter");
        System.out.println("1. Triangle");
        System.out.println("2. Rectangle");
        System.out.println("3. Parallelogram");
        System.out.println("4. Trapezium");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        float a, b, c, d, peri, s;
        double area;
        switch(n)
        {
            case 1:
            System.out.println("Enter the measurements of the three sides(Press enter after each)");
            a= sc.nextFloat();
            b= sc.nextFloat();
            c= sc.nextFloat();
            peri= a+ b+ c;
            s= (a+b+c)/2;
            area= s*(s-a)*(s-b)*(s-c);
            area= Math.sqrt(area);
            System.out.println("Perimeter= "+ peri);
            System.out.println("Area= "+ area);
            break;
            case 2:
            System.out.println("Enter the measurements of the length and breadth(Press enter after each)");
            a= sc.nextFloat();
            b= sc.nextFloat();
            peri= 2*(a+b);
            area= a*b;
            System.out.println("Perimeter= "+ peri);
            System.out.println("Area= "+ area);
            break;
            case 3:
            System.out.println("Enter the measurements of the base, second side and the height from the base respectively(Press enter after each)");
            a= sc.nextFloat();
            b= sc.nextFloat();
            c= sc.nextFloat();
            peri= 2*(a+b);
            area= a*c;
            System.out.println("Perimeter= "+ peri);
            System.out.println("Area= "+ area);
            break;
            case 4:
            System.out.println("Enter the measurements of the two parallel sides and the two non parallel sides respectively(Press enter after each)");
            a= sc.nextFloat();
            b= sc.nextFloat();
            c= sc.nextFloat();
            d= sc.nextFloat();
            peri= a+b+c+d;
            System.out.println("Enter the distance between the parallel sides");
            float h= sc.nextFloat();
            area= ((a+b)*h)/2;
            System.out.println("Perimeter= "+ peri);
            System.out.println("Area= "+ area);
            break;
            default:
            System.out.println("Invalid Value");
        }
        System.out.println();
    }
}