import java .util.*;
public class Activityselection {
    public static void main(String[] args) {
        int Start[]={1,3,0,5,8,5};
        int End[]={2,4,6,7,9,9};
        int activities[][]=new int [Start.length][3];
        for(int i=0; i<Start.length; i++){
            activities[i][0]=i;
            activities[i][1]=Start[i];
            activities[i][2]=End[i];
        }
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        int maxAct=0;
        ArrayList<Integer>ans=new ArrayList<>();
        maxAct=1;
         ans.add(activities[0][0]);
        int Lastend=activities[0][2];
        for(int i=0; i<End.length;i++){
            if(activities[i][1]>=Lastend){
                maxAct++;
                ans.add(activities[i][0]);
                Lastend=activities[i][2];
            }
        }  
        System.out.println("max activities="+maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
   
}
    
}
