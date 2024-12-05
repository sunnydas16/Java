import java.util.*;

public class Squarestar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the column : ");
        int a = sc.nextInt();
        System.out.print("Enter the row : ");
        int b = sc.nextInt();
        int i;
        int j;
        for(i=1;i<=a;i++){
            for(j=1;j<=(b-1);j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}