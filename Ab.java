import java.util.*;

public class Ab{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the INR : ");
        double inr = sc.nextDouble();

        System.out.println("Convert to 1/USD 2/AED 3/EUR 4/KWD");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                double usd = 84.38;
                double inrusd = 0; 
                    inrusd = inr/usd;
                    System.out.println(inrusd +" USD ");
            break;
            case 2:
                double aed = 22.97;
                double inraed;
                    inraed = inr/aed;
                    System.out.println(inraed +" AED ");
            break;
            case 3:
                double eur = 90.46;
                double inreur;
                    inreur = inr/eur;
                    System.out.println(inreur +" EUR ");
            break;
            case 4:
                double kwd = 275.16;
                double inrkwd;
                    inrkwd = inr/kwd;
                    System.out.println(inrkwd +" KWD ");
            break;
        }
        
        

    }
}