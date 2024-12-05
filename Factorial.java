import java.util.*;

public class Factorial{
    public static void summ(int a){
        int b = 1;
        for(int i=a;i>=1;i--){
        b = b*i;
                
        }
        System.out.println(b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        summ(a);
        
    }
}