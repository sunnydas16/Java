import java.util.*;

public class Reverseforloop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the reverse number from : ");
        int a = sc.nextInt();
        System.out.print("enter the reverse number to : ");
        int b = sc.nextInt();
        for(int i=a;i>=b;i--){
            System.out.println(i);
        }
    }
}