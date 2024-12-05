import java.util.*;

public class Stringbuilder{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0 , 'P');
        System.out.println(sb);

        //add elements in char
        sb.insert(0 , "S");
        System.out.println(sb);

        //add in midle in char
        sb.insert(3, "n");
        System.out.println(sb);

        //delete the extra 'n'
        sb.delete(2,3);
        System.out.println(sb);

        //to add element in last
        sb.append("s");
        sb.append("tack");
        System.out.println(sb);
    }
}