import java.util.*;
import java.util.Queue;
import java.util.Stack;
public class InterLeaveHalf {
    public static void interleave2(Queue<Integer> q){
        Queue <Integer>firsthalf=new LinkedList<>();
         int size=q.size();
         for(int i=0; i<size/2; i++){
            firsthalf.add(q.remove());
         }
         while(!firsthalf.isEmpty()){
            q.add(firsthalf.remove());
            q.add( q.remove());
         }
    }
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue <Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // q.add(6);
        // q.add(7);
        // q.add(8);
        // q.add(9);
        // q.add(10);
        // interleave2(q);
        reverse
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }
    
}
