import java.util.*;

public class Arraywithfunction{

  public static void square(int[] arr){
      for(int i = 0;i<arr.length;i++){
      arr[i] = arr[i]*arr[i]*arr[i];
    }
    for(int i = 0;i<arr.length;i++){
      System.out.print(" " +arr[i]);
    }
  }

  public static void sum(int[] arr){
      int sum = 0;
    for(int i = 0;i < arr.length;i++){
        sum = sum+arr[i];
    }


      System.out.println(" Sum is "+sum);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of array : ");
    int size = sc.nextInt();
    int[] arr = new int[size];

    for(int i = 0;i<arr.length;i++){
      System.out.print("Elements in arr : ");
       arr[i] = sc.nextInt();
    }

    
    square(arr);
    sum(arr);
  }
}