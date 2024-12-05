import java.util.*;
public class Pyramidstar{
    public static void main(String[] args){
        System.out.print("Enter the columns you want : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int i;
        for(i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }
}