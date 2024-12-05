import java.util.*;

public class Ab{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the your no. : ");
        int z = sc.nextInt();

        int c = sc.nextInt();
        int d = 0;

        if(z<c){
            System.out.print(" Invalid Input : ");
        }
        else{
        d = z%c;
        System.out.println("Reminder "+d);
        }
        

    }
}