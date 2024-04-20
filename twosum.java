public class twosum {
    public static int[] twosums(int[]nums, int target){
        int[] ans=new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    ans[i]=i;
                    ans[i+1]=j;
                    
                }
            }
        }
        return ans;
        
        
    }
    public static void main(String[] args) {
        int[]nums={2,6,5,8,11};
        int target=1;
        System.out.println(twosums(nums, target));
        
    }
    
}
