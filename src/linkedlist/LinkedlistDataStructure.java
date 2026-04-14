package linkedlist;
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
class Linklist {
    Node head;
    Node tail;
    int size=0;

    void addTail(int val) {
        Node temp = new Node(val);
        if (tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void display(Node head) {
        if (head == null) return; //PRINTING WITH RECURSION

        System.out.println(head.val + " ");
        display(head.next);
    }

    public void insert(int val, int indx) {
        if(indx<0||indx>size){
            System.out.println("Invalid index");return;
        }
        else if(indx==size) addTail(val);
        else{
            Node temp=head;
            for(int i=0;i<indx-1;i++){
                temp=temp.next;
            }
            Node t=new Node(val);
            t.next=temp.next;
            temp.next=t;
            size++;
        }

    }

    public void delete(int idx) {
        if(idx<0||idx>size){
            System.out.println("print invalid idx");
        }
        Node temp=head;
        for(int i=0;i<idx-1;i++){
           temp=temp.next;
        }
        temp.next=temp.next.next;
        if(idx==size-1)tail=temp;
        size--;
    }
}


public class LinkedlistDataStructure {
    public static void main(String[] args) {
        Linklist l1=new Linklist();
        l1.addTail(10);
        l1.addTail(20);
        l1.addTail(30);
        l1.addTail(40);
        l1.addTail(50);
       // l1.display(l1.head);
        l1.insert(3,2);
        //l1.display(l1.head);
        l1.delete(2);
        l1.display(l1.head);
    }
}
