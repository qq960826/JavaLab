package P3;

/**
 * Created by wzq on 11/18/16.
 */
public class DoubleLinkedList {
    DoubleLinkedListNode head;
    public DoubleLinkedList(){head=new DoubleLinkedListNode();
        head.prev=null;
        head.next=null;
    }
    public void insert(int val){
        DoubleLinkedListNode temp=head;
        while (temp.next!=null)temp=temp.next;
        DoubleLinkedListNode add=new DoubleLinkedListNode();
        add.next=null;
        add.prev=temp;
        add.val=val;
        temp.next=add;
    }
    public void insert(int pos,int val){
        DoubleLinkedListNode temp=head;
//        temp=temp.next;
        while (temp!=null&&pos>0){
            temp=temp.next;
            pos--;
        }
        DoubleLinkedListNode next=temp.next;


        DoubleLinkedListNode add=new DoubleLinkedListNode();
        add.next=next;
        add.prev=temp;
        add.val=val;
        temp.next=add;

    }
    public void delete(int pos){
        DoubleLinkedListNode temp=head;
        temp=temp.next;
        while (temp!=null&&pos>0){
            temp=temp.next;
            pos--;
        }
        if(temp==null)return;
        DoubleLinkedListNode prev=temp.prev;
        DoubleLinkedListNode next=temp.next;
        prev.next=next;
        if(next!=null)next.prev=prev;

    }
    public void delete_num(int data){
        DoubleLinkedListNode temp=head;
        temp=temp.next;
        while (temp!=null){
            if(temp.val==data)
            temp=temp.next;
        }
        if(temp==null)return;
        DoubleLinkedListNode prev=temp.prev;
        DoubleLinkedListNode next=temp.next;
        prev.next=next;
        if(next!=null)next.prev=prev;
    }
    public int size(){
        DoubleLinkedListNode temp=head;
        int num=-1;
        while (temp!=null){
            num++;
            temp=temp.next;
        }
        return num;
    }
    public boolean isempty(){
        return head.next==null;
    }
    public void traverse(){
        DoubleLinkedListNode temp=head;
        temp=head.next;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public int getData(int pos){
        DoubleLinkedListNode temp=head;
        temp=temp.next;
        while (temp!=null&&pos>0){
            temp=temp.next;
            pos--;
        }
        if(temp==null)return -1;
        return temp.val;

    }
    public static void main(String args[]){
        DoubleLinkedList doubleLinkedList=new DoubleLinkedList();

        doubleLinkedList.insert(1);
        doubleLinkedList.insert(5);
        doubleLinkedList.insert(0,20);
        doubleLinkedList.insert(0,21);

        doubleLinkedList.traverse();
        //System.out.print(doubleLinkedList.getData(1));

        doubleLinkedList.delete(0);
        doubleLinkedList.delete(0);

        //System.out.print(doubleLinkedList.size());
    }

}
