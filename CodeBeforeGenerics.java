package Week6.Day20;

import java.util.ArrayList;

public class CodeBeforeGenerics {
    public static void main(String[] args) {
        CodeBeforeGenerics c1 = new CodeBeforeGenerics();

        c1.codeBeforeGenerics();

        System.out.println("*********************************************");

        c1.codeAfterGenerics();

    }

    public void codeBeforeGenerics() {
        ArrayList arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        int i = (int) arrayList.get(0);
        int j = (int) arrayList.get(1);
        int k = (int) arrayList.get(2);
        int l = (int) arrayList.get(3);
        int m = (int) arrayList.get(4);

        for(Object index : arrayList) {
            System.out.println((int) index);
        }
    }

    public void codeAfterGenerics() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        int i = arrayList.get(0);
        int j = arrayList.get(1);
        int k = arrayList.get(2);
        int l = arrayList.get(3);
        int m = arrayList.get(4);

        for(Integer index : arrayList) {
            System.out.println(index);
        }


    }
}

/*

1
2
3
4
5
*********************************************
1
2
3
4
5


* */