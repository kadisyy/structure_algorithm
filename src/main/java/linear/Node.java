package linear;

// 单向链表
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

    // 判断节点是不是最后一个节点
    public boolean isLast(){
        return  this.next == null;
    }


    public void removeNext(){
       this.next =  next.next;
    }

    // 显示所有节点信息
    public void show(){
        Node currentNode = this;
        while (true){
            System.out.println(currentNode.data);
            Node newNext = currentNode.next;
            if (newNext == null){
                break;
            }
            currentNode = newNext;
        }
    }


    // 在当前节点后插入新的节点
    public void after( Node target){
        Node  afterNext= this.next;
        this.next = target;
        target.next = afterNext;
    }
}
