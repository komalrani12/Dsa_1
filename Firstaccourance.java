public class Firstaccourance {
    public static int firstaccur(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
       return firstaccur(arr, key, i+1);
    }
    public static  int lastoccurance(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isfound=lastoccurance(arr, key, i+1);
        if(isfound!=-1){
            return isfound;
        }
        if(arr[i]==key){
            return i;

        }
        return isfound;

    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1=power(x, n-1);
        int xn=x*xnm1;
        return xn;
    }
    public static void main(String[] args) {
        // int arr[]={};
        // int key=5;
        // System.out.println(lastoccurance(arr, key, 0));
         System.out.print(power(2, 10));
    }

    
}
