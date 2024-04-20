public class Checkpalindrome {
    public class Node{
        int  data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public Node findmid(Node head){
    Node slow=head;
    Node fast=head;
    while(fast==null && fast.next==null){
        slow=slow.next;
        fast=fast.next.next;

    }
    return slow;


    }

    public static void main(String[] args) {
        Checkpalindrome chk=new Checkpalindrome();
        chk.addLast(1);
    }

    
}
