import java.util.*;

public class Function{
        public static int xyz(int a,int b){
            int sum= a+b;
            return sum;
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number : ");
        int a = sc.nextInt();
                System.out.print("Enter the number : ");
        int b = sc.nextInt();
        int sum= xyz(a , b);
        System.out.println("The sum of number is : "+sum);
    }
}