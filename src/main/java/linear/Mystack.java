package linear;


import java.util.Arrays;

public class Mystack {
    private int[] elements;

    public Mystack() {
        elements = new int[0];
    }


    public int size() {
        return elements.length;
    }

    public int get(int index) {
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("越界");
        }

        return elements[index];
    }

    public void push(int e) {
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = e;
        elements = newArr;
    }

    public int pop() {
        int[] newArr = new int[elements.length - 1];
        int element = elements[elements.length -1];
        for (int i = 0; i < elements.length - 1; i++) {
            newArr[i] = elements[i];
        }
        elements = newArr;
        return element;
    }

    public int peek(){
        return elements[elements.length -1];
    }
    public void show() {
        System.out.println(Arrays.toString(elements));
    }

    public boolean isEmpty(){
        return elements.length == 0;
    }
}
