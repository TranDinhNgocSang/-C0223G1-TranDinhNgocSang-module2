package ss10_dsa_danh_sach.thuc_hanh.thuc_hanh_1;

import java.util.Arrays;

public class Mylist<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public Mylist() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa() {
        int newSize = elements.length *2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
}
