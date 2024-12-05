import java.util.*;

public class Calculator{
    public static void main(String[] args){
        System.out.println("1:Addition /n 2:Substraction /n 3:multiply /n 4:Divide");
        System.out.print("Enter the choice : ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.print("Enter 1st num : ");
        int a = sc.nextInt();
        
        System.out.print("Enter 2nd num : ");
        int b = sc.nextInt();

        int c;
        switch(choice){
            case 1: 
            c=a+b;
            System.out.println(c);
            break;
            case 2: c=a-b;
            System.out.println(c);
            break;
            case 3: c=a*b;
            System.out.println(c);
            break;
            case 4: c=a/b;
            System.out.println(c);
            break;
            default: System.out.println("Invalid choice given");

        }
    }
}