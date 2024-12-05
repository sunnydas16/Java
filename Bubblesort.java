import java.util.*;

public class Bubblesort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int array[] = new int[size];

        for(int i=0;i<array.length;i++){
            System.out.print("Enter the Elements of array : ");
            array[i]=sc.nextInt();
        }

        System.out.println("Array before sorting : ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j] > array[j+1]){
                    int temp =array[j];
                    array[j] =array[j+1];
                    array[j+1]= temp;
                }
            }
        }
        System.out.println();
        System.out.println("Array after Sorting : ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println();

    }
}