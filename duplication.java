public class duplication {
    public static void Removedup(String str,StringBuilder newstr,int idx,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        //kaam
        char currchar= str.charAt(idx);
        if(map[currchar-'a']==true){
            //duplicate
            Removedup(str, newstr, idx+1, map);

        }
        else{
            map[currchar-'a']=true;
            Removedup(str, newstr.append(currchar), idx, map);

        }
        
    }
    public static void main(String[] args) {
        String str="aappnnacollege";
        Removedup(str, new StringBuilder(" "), 0, new boolean[26]) ;
    }
    
}
