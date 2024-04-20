import java.util.LinkedList;
public class Classrooms {
    public static class Node{
        int data;
        Node next;
        public Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void getmid( Node head){
        Node slow=head;
         Node fast= head.next;
         while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
         }
         System.out.println(slow);

    }
    
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addLast(2);
        ll. addFirst(1);
        System.out.println(ll);
    }
    
}
