public class recursion{
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printDec(n-1);
        System.out.println(n);
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fact(n-1);
        return fn;
    }
    public static  int calcsum(int n){
        if(n==1){
            return 1; 
        }
        int snm1=calcsum(n-1); 
        int sn=n+snm1;
        return sn;

    }
    public static void main(String[] args) {
        int n=5;
        // printDec(n);
       System.out.println( calcsum(5)); 
        
    }

} 

    

