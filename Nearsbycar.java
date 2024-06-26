import java.util.PriorityQueue;

public class Nearsbycar {
    static class point implements Comparable<point>{
        int x;
        int y;
        int distsq;
        int idx;
        public point(int x,int y,int distsq, int idx){
            this.x=x;
            this.y=y;
            this.distsq=distsq;
            this.idx=idx;
        }
        @Override
        public int compareTo(point P2){
            return this.distsq-P2.distsq;
        }
    }
    public static void main(String[] args) {
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<point>pq=new PriorityQueue<>();
        for(int i=0; i<pts.length; i++){
            int distsq=pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
            pq.add(new point(pts[i][0],pts[i][1], distsq, i));
        }
        for(int i=0; i<k; i++){
            System.out.println("c"+pq.remove().idx);
        }
    }
    
}
