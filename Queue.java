import java.util.*;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(10);
        q.add(20);
        q.add(15);
        q.add(30);
        q.add(5);
        System.out.println("PriorityQueue: " + q);

        System.out.println("Contains 25: " + q.contains(25));

        System.out.println("Head of the q: " + q.peek());

        System.out.println("Size of the q: " + q.size());

        System.out.println("Is the q empty? " + q.isEmpty());

        System.out.println("Removed element: " + q.remove());
        System.out.println("PriorityQueue after removal: " + q);

        q.clear();
        System.out.println("PriorityQueue after clearing: " + q);
    }
}