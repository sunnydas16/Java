import java.util.*;

public class Switchprob{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(" 1:Adddition \n 2:Substraction \n 3:Multiplication ");
    int a = sc.nextInt();

    if(a<4){
    switch(a){
      case 1: 
      System.out.println("Addition numbers input : ");
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = b+c;
      System.out.println("Addition is : "+d);
      break;
      case 2:
      System.out.println("Substraction numbers input : ");
      int e = sc.nextInt();
      int f = sc.nextInt();
      if(e>f){
          int i = e-f;
          System.out.println("Substraction is : "+i);
      }
      else
      System.out.println("Wrong input");
      break;
      case 3:
      System.out.println("Multiplying numbers input : ");
      int j = sc.nextInt();
      int k = sc.nextInt();
      int l = j*k;
      System.out.println("Multiplication is : "+l);
      break;
    }
    }
    else
    System.out.println("Wrong Input given ");

  }
}