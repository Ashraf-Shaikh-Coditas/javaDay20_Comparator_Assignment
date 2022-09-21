package Week6.Day20.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(5);
        arrayList1.add(6);
        arrayList1.add(7);
        arrayList1.add(8);
        arrayList1.add(9);
        arrayList1.add(10);

        ListIterator<Integer> listIterator = arrayList1.listIterator();

        System.out.println("USING HASNEXT : ");
        while(listIterator.hasNext()) {
            System.out.println("Element : "+listIterator.next()+" Index : "+listIterator.nextIndex());
        }

        System.out.println("\nUSING HASPREVIOUS : ");
        while(listIterator.hasPrevious()) {
            System.out.println("Element : "+listIterator.previous()+" Index : "+listIterator.previousIndex());
        }
        listIterator.set(11);
        System.out.println(arrayList1);
        listIterator.remove();
        System.out.println(arrayList1);
    }
}
