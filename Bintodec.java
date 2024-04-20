public class Bintodec{
    public static void changebintodec(int num){
        int pow=0; 
        int decnum=0;
        while(num>0){
            int lastdigit=num%10;
            decnum=decnum+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            num=num/10;
            
        }
        System.out.println(decnum);

    }
    public static int linearsearch(int number[], int key){
        for(int i=0; i<=number.length; i++){
            if(number[i]==key){
                return i;
            }
        }
    
        return -1;
    }
    public static int binarysearch(int num[], int key){
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2; 
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
        

    }

    public static int greaternumber(int number[]){
        int largest= Integer.MIN_VALUE;
        int lowest=Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            if(largest<number[i]){
                largest=number[i];
                // System.out.println(largest);
            }
             if(lowest>number[i]){
                    lowest=number[i];
                }
            

            }
            System.out.println(lowest);
            
            
            
            return largest;
        }
        public static int binarysearh(int num[], int key){
            int start=0; int end= num.length-1;
            while(start<=end){
                int mid=(start+end)/2;
                if(num[mid]==key){
                    return mid;
                }
                else if(num[mid]<key){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            return -1;

        }
        public static void reverseanarray(int num[]){
            for(int i=num.length-1; i>=0;i--){
                System.out.println(num[i]);

            }
            
        
        }
        public static void reversearray2(int num[]){
            int first=0; int last=num.length-1;
            while(first<last){
                int temp=num[last];
                num[last]=num[first];
                num[first]=temp;
                first++;
                last--;
            }
            
        }
        public static int pairsinanarray(int num[]){
            for(int i=0; i<=num.length-1; i++ ){
               int curr=num[i];
            
            for(int j=i+1; j<=num.length-1;j++){
                System.out.println("("+curr+","+num[j]+")");
            }
        }
        return 0;
        }
        public static void printsubarray(int num[]){
            for(int i=0; i<=num.length-1; i++){
                int start=i; 
                for()

            }
        }

    public static void main(String[] args) {
        // changebintodec(101);
        int num[]={10,20,30,40,50,60,70,80};
        // int key=10;
        // System.out.println(linearsearch(number, key));
        // System.out.println(binarysearch(number, key));
        // System.out.println(greaternumber(number));
        // System.out.println(binarysearch(num, 50));
        // System.out.println(reverseanarray(num));
       
        // reversearray2(num);
    //  reverseanarray(num);
        // for(int i=0; i<=num.length-1; i++){

            // reverseanarray(num);
            // System.out.println(num[i]);
            // reversearray2(num[i]);
            pairsinanarray(num);
        }
    }
