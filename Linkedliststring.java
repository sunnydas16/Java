import java.util.*;

public class Linkedliststring{
  public static void main(String[] args){
    LinkedList <String> list = new LinkedList<String>();

    //Adding elements
    list.addFirst("s");
    list.addFirst("u");
    list.addFirst("n");

    System.out.println(list);
    list.addLast("y");
    list.addLast("z");
    System.out.println(list);

    System.out.println(list.size());

    //loop in linked list
    for(int i =0;i<list.size(); i++){
      System.out.print(list.get(i)+" -> " );
    }
    System.out.println("null");

    //Removing elements start and end
    list.removeFirst();
    System.out.println(list);

    list.removeLast();
    System.out.println(list);

    //Removing Element in MIDDLE
    list.remove(1);
    System.out.println(list);

  }
}