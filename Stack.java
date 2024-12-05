import java.util.*;

public class Stack{
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(20);
        s.push(10);
        s.push(44);
        s.push(23);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}