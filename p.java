public  class p{ 
    public static long sumSubstrings(String s){
        long ans=0;
        for(int i=0; i<s.length(); i++){
            long curr=0;
            for(int j=i; j<s.length(); j++){
                curr+=s.charAt(i)-'0';
                ans+=curr;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="1234";
       System.out.println( sumSubstrings(s));

    }
}