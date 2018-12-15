package linear;


public class TestNode {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

//        n1.append(n2);
//        n2.append(n3);
//        n3.append(n4);
//
//        System.out.println(n2.next.data);


        // 连续增加
        n1.append(n2).append(n3).append(n4);

        //n1.show();
        //n1.next.removeNext();
        //n1.show();

        Node n5 = new Node(5);
        n3.after(n5);
        n1.show();
    }
}
