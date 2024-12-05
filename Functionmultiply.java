import java.util.*;

public class Functionmultiply{
    public static int multiply(int a,int b){
        int m = a*b;
        return m;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number : ");
        int a = sc.nextInt();
        System.out.print("Enter The number : ");
        int b = sc.nextInt();

        int m = multiply(a,b);
        System.out.println("The multiplication is : "+m);

    }
}