package Week6.Day20.Assignments;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        for(Integer integer : queue) {
            System.out.println(integer);
        }

        System.out.println(" Front removed : "+queue.element());
        System.out.println("Front Removed :: using remove():: "+queue.remove());
        System.out.println("Front Removed using poll():: "+queue.poll());
    }
}
