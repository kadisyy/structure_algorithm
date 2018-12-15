package linear;


public class TestMystack {
    public static void main(String[] args) {
        Mystack mystack = new Mystack();
        mystack.push(1);
        mystack.push(-1);
        mystack.push(3);
        mystack.push(0);

        mystack.show();

        System.out.println(mystack.peek());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.isEmpty());

        // 取完
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.isEmpty());
    }
}
