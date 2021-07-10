//meteor showers
import java.util.*;
class project17
{
    public static void main(String args[])
    {
        System.out.println("Stargazer's meteor shower guide:");
        //accepting the input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a month:");
        String m= sc.nextLine();
        String m2= m.toLowerCase();
        char[] months= {'j','f','m','a','m','j','j','a','s','o','n','d'};
        String[] meteor= {"","Quadrantids in first week of","No meteor shower in","No meteor shower in","Lyrids in late","Eta Aquarids in first week of","No meteor shower in","Delta Aquarids in late","Perseids in mid","No meteor shower in","Draconids and Orionids in","Taurids and Leonids in","Geminids and Ursids"};
        char c= m2.charAt(0);
        int k= 0;
        //checking which month was entered and matching it in the standard array
        for(int i=0; i<12; i++)
        {
            if(months[i]==c)
            {
                k= i+1;
                break;
            }
        }
        //printing the output
        System.out.println("Meteor Shower: "+ meteor[k]+" "+m);
        System.out.println();
    }
}