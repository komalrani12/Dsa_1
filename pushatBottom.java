import java.util.Stack;
public class pushatBottom {
    public static void pushatB(Stack <Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushatB(s, data);
        s.push(top);

     }
    public static void main(String[] args) {
        Stack<Integer>s=new  Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushatB(s, 4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
            

        }
        
    }
    
}