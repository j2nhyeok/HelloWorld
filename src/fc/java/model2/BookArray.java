package fc.java.model2;

import java.util.Arrays;

public class BookArray {
    private static final int DEFAULT_CAPACITY = 5;
    private Book[] elements;
    private int size = 0;
    public BookArray(){
        elements = new Book[DEFAULT_CAPACITY];
    }

    // 저장하는 동작
    public void add(Book element){
        if(size >= elements.length){
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public Book get(int index){
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
