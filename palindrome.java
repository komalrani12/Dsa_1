
    public class palindrome{
        public static boolean checkpalindrome(int n){
           int rev=0;
           int rev_copy=n;
           while(n>0){
               int lastdigit=n%10;
               rev=(rev*10)+lastdigit;
               n=n/10;
           }
           if(rev==rev_copy){
               return 1;
           }else{
               
           return 0;
           }
       }

    
    
        public static int palinArray(int[] a, int n) {
                   for(int i=0; i<n; i++){
                       if(!checkpalindrome(a[i])){
                        return 0;
                       }
                    }
                    return 1;
                }
            }
            public static static void main(String[]args){
                int n=5;
                int []a={}

            }
        