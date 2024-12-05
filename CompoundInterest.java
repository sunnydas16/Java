import java.util.*;

public class CompoundInterest{
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the pri : ");
        double pri = sc.nextDouble();
        System.out.print("Enter the Time : ");
        double time      = sc.nextDouble();
        System.out.print("Enter the Rate : ");
        double rate      = sc.nextDouble();

        double CI = pri * (Math.pow((1 + rate/100),time));
        System.out.println("Compound Interest is : " +CI);

    }
}
