import java.util.*;
public class Hollorectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int a = sc.nextInt();
        System.out.print("Enter the boundary : ");
        int b = sc.nextInt();

        int i;
        int j;

        for(i=1;i<=a;i++){
            for(j=1;j<=b;j++){
                if(i==1 || j==1 || i==a || j==b){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}