import java.util.*;

public class Usersum{
    public static void main(String[] args){
        System.out.print("Enter the first number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        int addition = a+b;
        System.out.println("The ADDITION is : " + addition);
    }
}