package Week6.Day20.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(1,"Ashraf","Jalgaon"));
        arrayList.add(new Student(2,"Aman","Pune"));
        arrayList.add(new Student(3,"Eoin","Jalgaon"));
        arrayList.add(new Student(4,"Praveer","Mumbai"));
        arrayList.add(new Student(5,"Sanyami","Jalgaon"));

        System.out.println("Before Sorting : ");
        for(int i =0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("After sorting according to Id : ");
        Collections.sort(arrayList,new SortByRoll());
        for(int i =0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println();

        System.out.println("After sorting according to Name : ");
        Collections.sort(arrayList,new SortByName());
        for(int i =0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println();

        System.out.println("After sorting according to City : ");
        Collections.sort(arrayList,new SortByCity());
        for(int i =0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }

    }
}
