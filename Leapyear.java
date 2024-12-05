import java.util.*;

public class Leapyear{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year your want to Check : ");
        int z = sc.nextInt();

        if(z%4 == 0){
            System.out.println(+z +" Year is Leap year");
        }
        else{
            System.out.println(+z +" Year is not Leap Year");
        }
        

    }
}