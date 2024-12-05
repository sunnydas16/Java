import java.util.*;

public class Fibo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. till you want : ");
        int range = sc.nextInt();

        int a = 0;
        int b = 1;
        int c;

        for(int i=0;i<range;i++){
            System.out.println(a +" ");
            c = a+b;
            a = b;
            b = c;
        }

    }
}