package ss10_dsa_danh_sach.bai_tap.bai_tap_1;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    private void ensureCapa() {
        int newSize = elements.length + 5;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void disPlay() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i]);
        }
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public void addToIndex(int index, E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        for (int i = elements.length - 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public void remove(E element) {
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (element == elements[i]) {
                index = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        }
    }
}

