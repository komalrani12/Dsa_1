public class Backtrackingarray {
    public static void changearray(int arr[], int val, int i ){
        if(i==arr.length){
            printarray(arr);
            return;
        }
        arr[i]=val;
        changearray(arr, val+1, i+1);
        arr[i]=arr[i]-2;

    }
    public static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        changearray(arr,1,0);
        printarray(arr);

    }
    
}
