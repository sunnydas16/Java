import java.util.*;

public class Arraystring{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        int length= sc.nextInt();

        String name[] = new String[length];

        for(int i=0;i<name.length;i++){
            System.out.print("Enter the Names : ");
            name[i]= sc.next();
        }

        for(int i=0;i<name.length;i++){
            System.out.println("The names are : "+name[i]);
        }
    }
}