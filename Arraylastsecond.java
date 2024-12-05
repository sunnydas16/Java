import java.util.*;

public class Arraylastsecond{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter array elements : ");
            arr[i] =sc.nextInt();
        }


        int x = arr[arr.length-2];

        System.out.println("last second number is : "+x);

    }
}