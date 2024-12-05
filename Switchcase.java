import java.util.*;

public class Switchcase{
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter \n 1.add \n 2.mult : ");
    int a = sc.nextInt();
    if(a<3){
    switch (a){
      case 1:
          System.out.print("Enter numbers : ");
          int b = sc.nextInt(); 
          int c = sc.nextInt();
          int add = b+c;
          System.out.println(add);
        break;
      case 2:
                System.out.print("Enter numbers : ");

        int d = sc.nextInt(); 
          int e = sc.nextInt();
          int mult = d*e;
          System.out.println(mult);
    }
    }
    else
    System.out.println("Wrong Option");
  }
}