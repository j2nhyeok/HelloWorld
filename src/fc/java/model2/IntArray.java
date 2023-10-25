package fc.java.model2;

import java.util.Arrays;

public class IntArray {
    private static final int DEFAULT_CAPACITY = 5;
    private int[] elements;
    private int size = 0;
    public IntArray(){
        elements = new int[DEFAULT_CAPACITY];
    }

    // 저장하는 동작
    public void add(int element){
        if(size >= elements.length){
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public int get(int index){
        //index 체크

        return elements[index];
    }

    public int size(){
        return size;
    }

    public void ensureCapacity(){
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}
