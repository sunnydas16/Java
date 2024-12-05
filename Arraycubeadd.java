import java.util.*;
public class Arraycubeadd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] sr = new int[size];

        for(int i=0;i<sr.length;i++){
            System.out.print("Enter the elements in array : ");
            sr[i] = sc.nextInt();
        }

        for(int i=0;i<sr.length;i++){
            System.out.print(sr[i]+" ");
        }

        System.out.println();

        for(int i=0;i<sr.length;i++){
        sr[i]= sr[i]*sr[i]*sr[i];
        System.out.print(sr[i]+" ");
        }

        System.out.println();

        int a = 0;
        for(int i=0;i<sr.length;i++){
            a = a+sr[i];
            System.out.print(a+ " ");
        }
        System.out.println();

        System.out.println("Addition is : " +a);
    }
}