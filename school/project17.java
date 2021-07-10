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
        String[] months= {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
        String[] meteor= {"Quadrantids in first week of","No meteor shower in","No meteor shower in","Lyrids in late","Eta Aquarids in first week of","No meteor shower in","Delta Aquarids in late","Perseids in mid","No meteor shower in","Draconids and Orionids in","Taurids and Leonids in","Geminids and Ursids"};
        String f= m2.substring(0, 3);
        int k= 0;
        //checking which month was entered and matching it in the standard array
        for(int i=0; i<=11; i++)
        {
            if(f.equals(months[i]))
            {
                k= i;
                break;
            }
        }
        //printing the output
        System.out.println("Meteor Shower: "+ meteor[k]+" "+m);
        System.out.println();
    }
}