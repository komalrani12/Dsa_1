 import java.util.*;
 import java.util.Queue;
 public class Subtree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    // public static boolean isIdentical(Node node,Node subRoot){
    //     if(node==null&& subRoot==null){
    //         return true;
    //     }else if(node==null||subRoot==null||node.data!=subRoot.data){
    //         return false;
    //     }
    //     if(!isIdentical(node.left, subRoot.left)){
    //         return false;
    //     }
    //     if(!isIdentical(node.right, subRoot.right)){
    //         return false;
    //     }

    //     return true;
    //     }

    
    // public static boolean issubtree(Node root,Node subRoot){
    //     if(root.data==subRoot.data){
    //         if(isIdentical(root,subRoot)){
    //             return true;
    //         }

    //     }
    //     return issubtree(root.left, subRoot)||issubtree(root.right, subRoot);
    // static class Info{
    //     Node node;
    //     int hd;
    //     public  Info(Node node,int hd){
    //         this.node=node;
    //         this.hd=hd;
    //     }
    // }
    // public static void topview(Node root){
    //     Queue<Info> q=new LinkedList<>();
    //     HashMap<Integer,Node>map=new HashMap<>();
    //     int min=0; 
    //     int max=0;
    //     q.add(new Info(root,0));
    //     q.add(null);
    //     while(!q.isEmpty()){
    //         Info curr=q.remove();
    //         if(curr==null){
    //             if(q.isEmpty()){
    //                 break;
    //             }
    //             else{
    //                 q.add(null);
    //             }
    //         }
    //         if(!map.containsKey(curr.hd)){
    //             map.put(curr.hd,curr.node);
    //         }
    //         else{
    //             if(curr.node.left!=null){
    //                 q.add(new Info(curr.node.left,curr.hd-1));
    //                 min=Math.min(min,curr.hd-1);
    //             }
    //             if(curr.node.right!=null){
    //                 q.add(new Info(curr.node.right,curr.hd+1));
    //                 max=Math.max(max,curr.hd+1);
    //             }
    //         }
    //     }
    //     for(int i=min; i<=max; i++){
    //         System.out.print(map.get(i).data+" ");
    //     }
    //     System.out.println();
//  }
    
//     public static void Klevel(Node root, int level,int k){
//         if(root==null){
//             return;
//         }
//         if(level==k){
//             System.out.print(root.data+" ");
//             return;
//         }
//         Klevel(root.left, level+1, k);
//         Klevel(root.right, level+1, k);
//     }

//     public static boolean getpath(Node root, int n, ArrayList< Node> path){
//          if(root==null ){
//            return false;
//          }
//         path.add(root);
//         if(root.data==n){
//             return true;
//         }
//         boolean foundleft=getpath(root.left,n,path);
//         boolean foundright=getpath(root.right,n,path);
//         if(foundleft||foundright){
//             return true;
//         }
//         path.remove(path.size()-1);
//         return false;

//     }
//     public static Node lca(Node root ,int n1,int n2){
//         ArrayList<Node>path1=new ArrayList();
//         ArrayList<Node>path2=new ArrayList();
//         getpath(root,n1,path1);
//         getpath(root,n2,path2);
//         for(int i=0; i<path1.size()&&i<path2.size(); i++){
//             if(path1.get(i)!=path2.get(i)){
//                 break;
//             }
//             Node lca=path1.get(i-1);
//             return lca;
//         }
//         return 

//     }
    public static Node lca2(Node root,int n1,int n2){
        if(root==null){
            return root;
        }
        if(root.data==n1||root.data==n2){
            return root;
        }
        Node leftlca=lca2(root.left,n1,n2);
        Node rightlca=lca2(root.right,n1,n2);
        if(rightlca==null){
            return leftlca;

        }
        if(leftlca==null){
            return rightlca;
        }
        return root;
    }
    public static int lcadist(Node root, int n){
        if(root==null){
            return-1;
        }
        if(root.data==n){
            return 0;
        }
        int leftdist=lcadist(root.left,n);
        int rightdist=lcadist(root.right,n);
        if(leftdist==-1&& rightdist==-1){
            return -1;
        }
         else if(leftdist==-1){
            return rightdist+1;
         } else{
            return leftdist+1;
         }

    }
    public static int mindist(Node root,int n1, int n2 ){
        Node  lca=lca2(root,n1,n2);
        int dist1=lcadist(root,n1);
        int dist2=lcadist(root,n2);
        return dist1+dist2;
    }
    public static int Kancestor(Node root,int n,int k){
        if(root==null){
            return-1;
        }
        if(root.data==n){
            return 0;
        }
        int leftdist=Kancestor(root.left, n, k);
        int rightdist=Kancestor(root.right, n, k);
        if(leftdist==-1 && rightdist==-1){
            return -1;
        }
        int max=Math.max(leftdist,rightdist);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
    }
    public static int transform(Node root){
        if(root==null){
            return 0;
        }
         int leftchild=transform(root.left);
         int rightchild=transform(root.right);
         int data=root.data;
         int newLeft=root.left==null?0:root. left.data;
         int newRight=root.right==null?0: root. right.data;
        root.data=newLeft+leftchild+newRight+rightchild;

        return data;
    } 
    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    } 

    public static void main(String[] args) {
        Node root= new Node(1);
        root.left= new Node(2);
         root.right= new Node(3);
         root.left.left= new Node(4);
        root.left.right= new Node(5);
        root. right.left= new Node(6);
        root.right.right= new Node(7);

    //   Node subRoot=new Node(2);
    //    subRoot.left=new Node(4);
    // //    subRoot.right=new Node(5);
    //     System.out.println(issubtree(root,subRoot));
    //   topview(root);
    // Klevel(root, 1, 3);
    // System.out.println(Kancestor(root, 4, 2 ));
    transform(root);
    preorder(root);
    }
    
}
