public class Linkedlist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
     public static Node head;
     public static Node tail;

        public void addfirst(int data){ 
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
            return;
            }
            newNode.next=head;
            head=newNode;
        }
        public void addlast(int data){
            Node newNode=new Node(data);
            if(head ==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public void print(){
            Node temp=head;
            if(head==null){
                System.out.println("ll is empty");
                return;
            }
            while(temp !=null){
                System.out.print(temp.data+" -->");
                 temp=temp.next;
                }
                
                System.out.println("null");
               // System.out.print("null");

            }
        public  int itrSearch(int key){
            Node temp=head;
            int i=0;
            while(temp!=null){
                if(temp.data==key){
                    return i;
                }
                temp=temp.next;
                i++;
            }
            return -1;
        }
        //add in the middle size 
        public void add(int idx, int data){
            Node newNode=new Node(data);
            Node temp=head;
            int i=0;
            while(i<idx-1){
                temp=temp.next;
                i++;
            }
        }
        
    
    
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.print();
        ll.addfirst(2);
        ll.print();
        ll.addfirst(1);
        ll.print();
         ll.addlast(3);
        ll.print();
         ll.addlast(4);
         ll.print();
         System.out.println(ll.itrSearch(3));
         System.out.println(ll.itrSearch(10));
    }
   
}
    

