import java.util.*;
public class Functionx{
    public static int printthis(int a,int b){
            int c=1;
            for(int i=0;i<5;i++){
                 c = a+b;
            }

            for(int i=0;i<5;i++){
                 System.out.println(c);
            }
            return 1;
        }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a= sc.nextInt();
        System.out.print("Enter the first number : ");
        int b= sc.nextInt();

        printthis(a,b);
    }
}