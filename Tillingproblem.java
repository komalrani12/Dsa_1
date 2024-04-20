public class Tillingproblem {
    public static int tilproblrm(int n){//2*n floor size
        if(n==0||n==1){
            return 1;

    }
    //vertical choice
    int nm1=tilproblrm(n-1);
    //horizontal choice
    int nm2=tilproblrm(n-2);
    return nm1+nm2;

    }
    public static void main(String[] args) {
        System.out.println(tilproblrm(4));
    }
    
}
