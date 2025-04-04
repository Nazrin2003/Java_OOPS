// 18. Write a Java program to compare two hash set.
import java.util.*;

public class Hashset{
    public static void main(String args[]){
        HashSet <String> s1 = new HashSet<>();
        s1.add("Apple");
        s1.add("Banana");
        s1.add("Grapes");

        HashSet <String> s2 = new HashSet<>();
        s2.add("Apple");
        s2.add("Banana");
        s2.add("Grapes");

        System.out.println("Is the set s1 and s2 equal?"+s1.equals(s2));
        
    }
}