import java.util.*;

public class Arrayindexfind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of array : ");
        int length = sc.nextInt();

        int ary[] = new int[length];

        for(int i=0;i<ary.length;i++){
            System.out.print("Enter the elements of array : ");
            ary[i]=sc.nextInt();
        }

        System.out.print("Enter the number you want to search : ");
        int sr = sc.nextInt();
        for(int i=0;i<ary.length;i++){
            if(ary[i] == sr){
                System.out.println("Found at index : "+i);
            }
        }
    }
}