package Week6.Day20.List;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> List1 = new LinkedList<>();
        List1.add(1);
        List1.add(3);
        List1.add(5);
        List1.add(7);
        List1.add(9);

        List<Integer> List2 = new LinkedList<>();
        List2.add(2);
        List2.add(4);
        List2.add(6);
        List2.add(8);
        List2.add(10);

        System.out.println("Size of ArrayList :: "+List1.size());
        List1.addAll(List2);

        System.out.println(List1);

        System.out.println("Index of 10 is :: "+List1.indexOf(10));

        List1.get(1);

        System.out.println("Is list empty:: "+List1.isEmpty());

        List1.remove(9);
        System.out.println(List1);

        List<Integer> List = List1.subList(2,7);
        System.out.println("Sublist :: "+List);

    }

}

/*

Size of ArrayList :: 5

[1, 3, 5, 7, 9, 2, 4, 6, 8, 10]

Index of 10 is :: 9

Is list empty:: false

[1, 3, 5, 7, 9, 2, 4, 6, 8]

Sublist :: [5, 7, 9, 2, 4]


* */