package Week6.Day20.Assignments;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueueDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);

        System.out.println(deque);

        deque.addFirst(10);
        System.out.println("\naddFirst() operation :: "+deque);

        deque.addLast(20);
        System.out.println("addLast() operation :: "+deque);

        System.out.println("element() : "+deque.element());
        System.out.println("getFirst() : "+deque.getFirst());
        System.out.println("getLast() : "+deque.getLast());
        System.out.println("peekFirst() : "+deque.peekFirst());
        System.out.println("peekLast() : "+deque.peekLast());

        System.out.println("peek() : "+deque.peek());
        deque.offer(2);
        deque.offerFirst(100);
        deque.offerLast(151);

        System.out.println(deque);


    }
}

/*

[1, 2, 3, 4, 5]

addFirst() operation :: [10, 1, 2, 3, 4, 5]

addLast() operation :: [10, 1, 2, 3, 4, 5, 20]

element() : 10

getFirst() : 10

getLast() : 20

peekFirst() : 10

peekLast() : 20

peek() : 10

[100, 10, 1, 2, 3, 4, 5, 20, 2, 151]

* */