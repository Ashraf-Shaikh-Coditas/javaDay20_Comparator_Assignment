package Week6.Day20.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(3);
        arrayList1.add(5);
        arrayList1.add(7);
        arrayList1.add(9);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(2);
        arrayList2.add(4);
        arrayList2.add(6);
        arrayList2.add(8);
        arrayList2.add(10);

        System.out.println("Size of ArrayList :: "+arrayList1.size());
        arrayList1.addAll(arrayList2);

        System.out.println(arrayList1);

        System.out.println("Index of 10 is :: "+arrayList1.indexOf(10));

        arrayList1.get(1);

        System.out.println("Is list empty:: "+arrayList1.isEmpty());

        arrayList1.remove(9);
        System.out.println(arrayList1);

        List<Integer> List = arrayList1.subList(2,7);
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