import java.util.*;

public class Atm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bank Name : ");
        String a = sc.nextLine();
        System.out.println(a);
        int b = sc.nextInt();
        
        if( b == 123){
            System.out.println("******  Welcome to SBI  ******* ");
            System.out.println("Enter the money to want to credit ");
            Scanner s = new Scanner(System.in);
            int money = s.nextInt();
            System.out.println("Money credit sucessful : " +money);
            System.out.println("    Welcome to SBI ATM    ");
            System.out.println("1-> Available Cash 2-> Cash Withdraw ");
            
            int sw = s.nextInt(); 
            switch(sw){
                case 1:
                    System.out.println("Enter the cash you want to Withdraw : "); 
                    int withdraw = sc.nextInt();
                    System.out.println("Withdraw sucessful ");
                    int debit = withdraw-money;
                    System.out.println("Available balance = "+debit);
                break;
                case 2:
                System.out.print(" Available Balance ");
                break;
            }






        }
        else{
            System.out.println("nahi chala");
        }

        
        

    }
}