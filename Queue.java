public class Queue{
    static class Node{
        int data;
        Node  next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static  class queueArray{
        // static int arr[];
        // static int size;
        // static int rear;
        // queueArray(int n){}
        //     arr=new int[n];
        //     size=n;
        //     rear=-1;
        static Node  head=null;
        static Node tail=null;

        
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
    
        //add
        public static void Add(int data){
            if(rear==size-1){
                System.out.println("queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int font=arr[0];
            for(int i=0; i<rear; i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return font;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];
        }
        
    }
    
    public static void main(String atgs[]){
        queueArray q= new queueArray(5);
        q.Add(1);
        q.Add(2);
        q.Add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
}
}


    
    

