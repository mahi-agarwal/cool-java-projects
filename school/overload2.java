import java.util.*;
class overload2
{
    static void volume(float l, float w, float h)
    {
        System.out.println("Volume: "+ (l*w*h));
    }
    static void volume(float a)
    {
        System.out.println("Volume: "+ (a*a*a));
    }
    static void volume(float r, float h)
    {
        System.out.println("Volume: "+ (3.14*r*r*h));
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose volume of: 1. Cuboid; 2. Cube; 3. Cylinder");
        int opt= sc.nextInt();
        switch(opt)
        {
            case 1: 
            System.out.println("Enter length, width and height");
            float x= sc.nextFloat();
            float y= sc.nextFloat();
            float z= sc.nextFloat();
            volume(x,y,z);
            break;
            
            case 2:
            System.out.println("Enter length of one edge or side");
            x= sc.nextFloat();
            volume(x);
            break;
            
            case 3:
            System.out.println("Enter radius and height respectively");
            x= sc.nextFloat();
            y= sc.nextFloat();
            volume(x,y);
            break;
            
            default:
            System.out.println("Invalid entry");
        }
        System.out.println();
    }
}