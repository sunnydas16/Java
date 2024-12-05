import java.util.*;
public class Reversepyramid{
    public static void main(String[] args){
        System.out.print("Enter the column : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=x;i>=1;i--){
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
             System.out.println();
        }
           
    }
}