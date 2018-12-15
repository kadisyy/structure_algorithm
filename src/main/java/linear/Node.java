package linear;


public class Node {
    int data;
    Node next;

    public Node(int value){
        this.data = value;
    }

    public Node append(Node node){
        //this.next = node;
        Node currentNode = this;
        while (true){
            Node nextNode = currentNode.next;
            //获取到最后一个节点,然后追加上去
            if (nextNode == null){
                break;
            }
            currentNode = nextNode;
        }
        currentNode.next = node;
        return this;
    }

    public Node next(){
        return this.next;
    }
}
