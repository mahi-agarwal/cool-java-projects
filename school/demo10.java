import java.util.*;
class demo10
{
    public static void main(String args[])
    {
        //Accepting an amount and finding the number of different notes and the remainder to make that amount
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an amount");
        float amt= sc.nextFloat();
        System.out.println("In Rs."+ amt);
        float r100= amt%100f;
        float n100= (amt-r100)/100f;
        System.out.println("No. of Rs.100 notes= "+ n100+ ", Remainder= Rs."+ r100);
        float r50= amt%50f;
        float n50= (amt-r50)/50f;
        System.out.println("No. of Rs.50 notes= "+ n50+ ", Remainder= Rs."+ r50);
        float r20= amt%20f;
        float n20= (amt-r20)/20f;
        System.out.println("No. of Rs.20 notes= "+ n20+ ", Remainder= Rs."+ r20);
        float r10= amt%10f;
        float n10= (amt-r10)/10f;
        System.out.println("No. of Rs.10 notes= "+ n10+ ", Remainder= Rs."+ r10);
        System.out.println();
    }
}