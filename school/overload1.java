import java.util.*;
class overload1
{
    static void area(float a, float b, float c)
    {
        float s= (a+b+c)/2;
        double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle: "+ area);
    }
    static void area(float a, float b)
    {
        System.out.println("Area of rectangle: "+ (a*b));
    }
    static void area(float a)
    {
        System.out.println("Area of square: "+ (a*a));
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose: 1. Triangle; 2. Rectangle; 3. Square");
        int opt= sc.nextInt();
        switch(opt)
        {
            case 1: 
            System.out.println("Enter three sides");
            float x= sc.nextFloat();
            float y= sc.nextFloat();
            float z= sc.nextFloat();
            area(x,y,z);
            break;
            
            case 2:
            System.out.println("Enter two sides");
            x= sc.nextFloat();
            y= sc.nextFloat();
            area(x,y);
            break;
            
            case 3:
            x= sc.nextFloat();
            System.out.println("Enter one side");
            area(x);
            break;
            
            default:
            System.out.println("Invalid entry");
        }
        System.out.println();
    }
}