package linear;

// 单向链表
public class LoopNode {
    int data;
    LoopNode next = this;

    public LoopNode(int value){
        this.data = value;
    }



    public LoopNode next(){
        return this.next;
    }

    // 判断节点是不是最后一个节点
    public boolean isLast(){
        return  this.next == null;
    }


    public void removeNext(){
       this.next =  next.next;
    }

    // 在当前节点后插入新的节点
    public void after( LoopNode target){
        LoopNode afterNext= this.next;
        this.next = target;
        target.next = afterNext;
    }
}
