package fc.java.course2.part1;

import fc.java.model2.IntArray;

public class MyIntArrayTest {
    public static void main(String[] args) {

        IntArray list = new IntArray();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println(list.size());
    }
}
