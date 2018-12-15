package linear;


//自己实现吧
public class Myqueue {
    private int[] elements;

    public Myqueue(){
        elements = new int[0];
    }
    public void add(){
    }

    public int poll(){
        return -1;
    }

    public int size(){
        return elements.length;
    }
    public boolean isEmpty(){
        return false;
    }
}
