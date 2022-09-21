package Week6.Day20.Set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        hashSet1.add(1);
        hashSet1.add(3);
        hashSet1.add(5);
        hashSet1.add(7);
        hashSet1.add(9);

        hashSet2.add(2);
        hashSet2.add(4);
        hashSet2.add(6);
        hashSet2.add(8);
        hashSet2.add(10);

        System.out.println("Set 1 : ");
        for(Integer i : hashSet1) {
            System.out.println(i);
        }

        System.out.println("\nSet 2 : ");
        for(Integer i : hashSet2) {
            System.out.println(i);
        }

        System.out.println("Size of HashSet1 : "+hashSet1.size());
        System.out.println("Contains 1 or not : "+hashSet1.contains(9));
        System.out.println("IsEmpty() : "+hashSet1.isEmpty());
        hashSet1.remove(9);
        System.out.println("\nAfter Removing 9 : "+hashSet1);

        hashSet1.addAll(hashSet2);
        System.out.println("After AddAll : "+hashSet2);

        hashSet1.removeAll(hashSet2);
        System.out.println("After RemoveAll : "+hashSet2);


    }
}

/* Behaviour :

Order : Unordered
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
Size of HashSet1 : 5
Contains 1 or not : true
IsEmpty() : false

After Removing 9 : [1, 3, 5, 7]
After AddAll : [2, 4, 6, 8, 10]
After RemoveAll : [2, 4, 6, 8, 10]



* */