import java.util.*;

public class Bubblesortdescending{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int size = sc.nextInt();

        int abc[] = new int[size];

        for(int i=0;i<abc.length;i++){
            System.out.print("Enter the elements of array : ");
            abc[i] = sc.nextInt();
        }

        System.out.print("The Arrays are : ");

        for(int i=0;i<abc.length;i++){
            System.out.print(abc[i] +" ");
        }
        System.out.println();

        for(int i=0;i<abc.length;i++){
            for(int j=0;j<abc.length-i-1;j++){
                if(abc[j]<abc[j+1]){
                    int tmpo = abc[j];
                    abc[j]   = abc[j+1];
                    abc[j+1] = tmpo;
                }
            }
        }



        System.out.println();

        System.out.print("The Sorted Arrays are : ");

        for(int i=0;i<abc.length;i++){
            System.out.print(abc[i] +" ");
        }
    }
}