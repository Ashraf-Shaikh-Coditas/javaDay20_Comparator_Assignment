package Week6.Day20.Comparator;

import java.util.Comparator;

public class SortByRoll implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.id-o2.id;
    }
}
