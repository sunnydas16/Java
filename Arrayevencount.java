import java.util.*;

public class Arrayevencount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i=0;i<a.length;i++){
            System.out.print("Enter the elements in array : ");
            a[i] = sc.nextInt();
        }
        System.out.print("Array is : ");

        for(int i=0;i<a.length;i++){
        System.out.print(a[i] +" ");
        }

        int c = 0;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                 if (((a[j])%2==0) && (a[j+1]%2==1)){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    c++;
                    break;
                }
            }
        }
       
        System.out.println();
        System.out.print("After the operation : ");

        for(int i=0;i<a.length;i++){
        System.out.print(a[i] +" ");
        }
        System.out.println();
        System.out.println("The operation time is : "+c);

    }
}