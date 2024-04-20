import java.util.*;
public class Classroom {
    public static void Swap(ArrayList<Integer>list,  int indx1, int indx2){
        int temp=list.get(indx1);
        list.set(indx1,list.get(indx2));
        list.set(indx2,temp);
    }

public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList<>();
    list.add(2);
    list.add(5);
    list.add(9);
    list.add(3);
    list.add(9);
    // System.out.println(list);
    //  int element=list.get(2);
    // System.out.println(element);
    // list.remove(2);
    // list.set(2,7);
    // System.out.println(list);
    // System.out.println(list.contains(11));
    // System.out.println(list.contains(1));
    // System.out.println(list.size());
    // int max=Integer.MIN_VALUE;
    // for(int i=0; i<list.size(); i++){
    //     if(max<list.get(i)){
    //         max=list.get(i);
    //     }
    // }
    // System.out.println("max element="+max);
     int indx1=1;
     int indx2=3;
     System.out.println(list);
    Swap(list, indx1, indx2);
    System.out.println(list);
}

    
}
