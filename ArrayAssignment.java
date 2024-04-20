

public class ArrayAssignment {
    public static void array(int nums[]){
        for(int i=0; i<=nums.length-1;i++){
         for(int j=i+1; j<nums.length; j++){

                if(nums[i]== nums[i+1]){
                    System.out.print(true);
                } 
            }
        }
     System.out.println(false);
        System.out.println();

    }
    public static  int maxprofit(int[]prices){
        int buy=prices[0];
        int profit=0;
        for(int i=0; i<prices.length; i++){
            if(buy<prices[i]){
                profit=Math.max(prices[i]-buy,profit);
            }
            else{
                buy=prices[i];
            }
        }
        return profit;
    }
    public static void printarray(int nums[]){
        for(int i=0; i<=nums.length-1; i++){
            System.out.print(nums[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int nums[]={1,2,3,4};
        // array(nums);
        // printarray(nums);
        int prices[]={7,1,5,3,6,4};
        System.out.print(maxprofit(prices));

        
    }
    
}
