import java.util.*;

public class Arraylist{
  public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<Integer>();

    //adding elements in the array list
    list.add(5);
    list.add(2);
    list.add(8);
    list.add(12);

    System.out.println(" "+list);

    //getting the element in the arraylist
    int a = list.get(0);

    System.out.println(a);

    //adding elements in between
    list.add(1, 23);
    System.out.println(list);

    //updating elements in between
    list.set(1, 6);
    System.out.println(list); 

    //delete elements in the arraylist
    list.remove(2);
    System.out.println(list);

    //size of arraylist
    //int size = list.size();
    System.out.println(list.size());

    //loop
    for(int i = 0;i<list.size();i++){
      System.out.print(list.get(i)+" ");
    }
    System.out.println();
    //Sorting
    Collections.sort(list);
    System.out.print(list);
  }
}