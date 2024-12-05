import java.util.*;

public class Biggestofthree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a<b){
            if(b>c){
                System.out.println("Biggest number is : "+b);
            }
            else{
                System.out.println("Biggest number is : "+c);
            }
        }
        if(a>b){
            if(a>c){
                System.out.println("Biggest number is : "+a);
            }
            else{
                System.out.println("Biggest number is : "+c);
            }
        }

        
    }
}