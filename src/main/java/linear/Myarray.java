package linear;

import java.util.Arrays;

/**
 * 其实就是实现ArrayList
 */
public class Myarray {
    private int[] elements;

    public Myarray() {
        elements = new int[0];
    }

    public int size() {
        return elements.length;
    }

    public void add(int v) {
        int[] newArry = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArry[i] = elements[i];
        }
        newArry[elements.length] = v;
        elements = newArry;
    }

    public void show() {
        System.out.println(Arrays.toString(elements));
    }

    public void del(int pos) {
        if (pos < 0 || pos > elements.length - 1) {
            throw new RuntimeException("越界");
        }

        int[] newDel = new int[elements.length - 1];
        for (int i = 0; i < elements.length; i++) {
            if (i < pos) {
                newDel[i] = elements[i];
            } else if (i > pos) {
                newDel[i - 1] = elements[i];
            } else {
                continue;
            }
        }
        elements = newDel;
    }

    public int get(int pos) {
        return elements[pos];
    }

    public void insert(int index, int value) {
        int[] temp = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            if (i < index) {
                temp[i] = elements[i];
            } else {
                temp[i + 1] = elements[i];
            }
        }
        temp[index] = value;
        elements = temp;
    }

    public void replace(int index, int value){
        if (index <0 ||index >elements.length-1){
            throw new RuntimeException("越界");
        }
        elements[index] = value;
    }
}
