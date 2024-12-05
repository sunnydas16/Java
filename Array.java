import java.util.*;

public class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter array elements : ");
            arr[i] =sc.nextInt();
        }
        System.out.print("The printed Array is : ");

        for(int i=0;i<size;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

    }
}