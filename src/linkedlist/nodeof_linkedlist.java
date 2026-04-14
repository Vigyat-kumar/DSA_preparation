package linkedlist;

//class Node {
//    int val;
//    Node next;
//
//    Node(int val) {
//        this.val = val;
//    }
//}
public class nodeof_linkedlist {
//    public static int get(Node head, int idx) {
//        Node temp = head;
//        for (int i = 1; i <= idx; i++) {
//            temp = temp.next;
//        }
//        return temp.val;
//
//    }

    public static void display(Node head) {
//      if(head==null)return; //PRINTING WITH RECURSION
//
//       System.out.println(head.val+" ");
//      display(head.next);


        Node temp = head;//FOR PRINTING WITH LOOPS
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);

        a.next = b;
        b.next = c;
        c.next = null;
        display(a);

    }
}

//        System.out.println(a.val);
//        System.out.println(b.val);
//        System.out.println(c.val);

