import java.util.*;

public class Functionfactorial{
    public static void factorial(int n){
        if(n<0){
            System.out.print("Invalid number entered ");
            return ;
        }
        int fact=1;
        for(int i=n;i>=1;i--){
            fact= fact*i;
        }

        System.out.println("Factorial is "+fact +" that is only");
        return ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Factorial number you want : ");
        int n = sc.nextInt();

        factorial(n);
    }
}