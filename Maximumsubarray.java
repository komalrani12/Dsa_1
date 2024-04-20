public class Maximumsubarray {
    public static int maxsumarr(int num[]){
         int currsum=0;
        int maxsum=Integer.MIN_VALUE;
       
        for(int i=0; i<=num.length-1;i++){
              int start= i;
            for(int j=i; j<=num.length-1;j++){
                int end=j;
                 currsum=0;
            for(int k=start; k<=end; k++){
                currsum+=num[k];
                
                
            }
            System.out.println(currsum);
            if(maxsum<currsum){
                maxsum=currsum;
                
                
            }
        }
        
        // return currsum;
            
        }
        return maxsum ;
    }
    
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
       System.out.println( maxsumarr(num));
        
    }
    
}
