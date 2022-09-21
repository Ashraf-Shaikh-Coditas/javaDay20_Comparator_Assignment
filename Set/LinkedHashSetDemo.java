package Week6.Day20.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();

        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(7);
        set1.add(9);

        set2.add(2);
        set2.add(4);
        set2.add(6);
        set2.add(8);
        set2.add(10);
        set2.add(null);

        System.out.println("Set 1 : ");
        for(Integer i : set1) {
            System.out.println(i);
        }

        System.out.println("\nSet 2 : ");
        for(Integer i : set2) {
            System.out.println(i);
        }

        System.out.println("Size of HashSet1 : "+set1.size());
        System.out.println("Contains 1 or not : "+set1.contains(9));
        System.out.println("IsEmpty() : "+set1.isEmpty());
        set1.remove(9);
        System.out.println("\nAfter Removing 9 : "+set1);

        set1.addAll(set2);
        System.out.println("After AddAll : "+set2);

        set1.removeAll(set2);
        System.out.println("After RemoveAll : "+set2);



    }
}

/* Behaviour :

Order : Insertion
Null : Allowed
Duplicate : Not Allowed

* */

/*

Set 1 :
1
3
5
7
9

Set 2 :
2
4
6
8
10
null
Size of HashSet1 : 5
Contains 1 or not : true
IsEmpty() : false

After Removing 9 : [1, 3, 5, 7]
After AddAll : [2, 4, 6, 8, 10, null]
After RemoveAll : [2, 4, 6, 8, 10, null]


* */
