import java .util.Stack;
public class Nextgreaterelement {
    // public static void  nextgrt(int arr[]){
    //     for (int i=0;i<arr.length; i++) {
    //         int temp=-1;
    //         for(int j=i+1; j<arr.length; j++){
    //             if(arr[i]<arr[j]){
    //                  temp=arr[j];
    //                  break;
    //             }
    //         }
            
    //         System.out.println(arr[i]+"--"+temp);
    //     }
    // }
    

        
    
    
    public static void main(String[] args) {

         int arr[]={6,8,0,1,3};
         Stack<Integer> s= new Stack<>();
         int nxtgtr[]=new int[arr.length];
         for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty()&& arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if( s.isEmpty()){
                nxtgtr [i]=-1;
            }
            else{
                nxtgtr[i] =arr[s.peek()];
                
            }
            s.push(i);

        }
        for(int i=0; i<nxtgtr.length; i++){
            System.out.print(nxtgtr[i]+" ");

            
        }
        System.out.println();
    }
        
        
}
    

