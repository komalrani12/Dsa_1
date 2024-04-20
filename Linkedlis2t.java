public class Linkedlis2t { 
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    } 
  public static    Node head;

  public static    Node tail;
    //add first  
    // public void addfirst(int data){
    //     Node newNode=new Node(data);
    //     if(head==null){
    //         head=tail=newNode;
    //         return;
    //     }
    //     newNode.next=head;
    //     head=newNode;
    // }
    // public void addlast(int data){
    //     Node newNode=new Node(data);
    //     if(head==null){
    //         head=tail=newNode;
    //     }
    //     tail.next=newNode;
    //     tail=newNode;
    // }
    // public void print(){
    //     if(head==null){
    //         System.out.println("ll is empty");
    //     }
    //     Node temp=head;
    //     while(temp!=null){
    //         System.out.print(temp.data+" ->");
    //         temp=temp.next;
    //     }
    //     System.out.println( "null");
    // }
    //add in the middle
    public static boolean iscycle(){
        Node slow= head;
        Node fast=head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;

    } 
    
    public static void main(String[] args) {
    //    Linkedlis2t ll2=new Linkedlis2t();
    //    ll2.print();
    //    ll2.addfirst(2);
    //    ll2.print();
    //    ll2.addfirst(1);
    //    ll2.print();
    //    ll2.addlast(3);
    //    ll2.print();
    //    ll2.addlast(4);
    //    ll2.print();
     head=new Node(1);
    head.next= new Node(2);
    head.next.next=new Node(3);
    head.next.next.next=head;
    System.out.println(iscycle());
    }
    
}
