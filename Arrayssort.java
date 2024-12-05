import java.util.*;

public class Arrayssort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int size = sc.nextInt();

        int array[] = new int[size];

        for(int i=0;i<array.length;i++){
            System.out.print("Enter the elements : ");
            array[i]= sc.nextInt();
        }

        System.out.println("Array elements are : ");

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }



        Arrays.sort(array);
        System.out.println();
        System.out.println("Sorted Array is : ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println();

        


    }
}