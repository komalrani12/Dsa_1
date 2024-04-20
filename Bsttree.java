public class Bsttree {
    static  class Node{
      int data;
      Node left;
      Node right;
      Node(int data){
          this.data=data;

      }
   }
   public static void inorder(Node root){
    if(root==null){
        return;
    }
    inorder(root.left);
    System.out.println(root.data+" ");
    inorder(root.right);
   }
   public static Node insert(Node root,int val){
    if(root==null){
        root=new Node(val);
        return root;
    }
    if(root.data>val){
        root.left=insert(root.left,val);
    }
    else{
        root.right=insert(root.right, val);
    }
    return root;
   }
   public static Node delete(Node root, int val){
    if(root.data<val){
      root.right=delete(root.right, val);
    }
    else if(root.data>val){
        root.left=delete(root.left, val);
    }
    else{
        if(root.left==null && root.right==null){
            return null;
        }
        if(root.left==null){
            return root.right;
        }
        else if(root.right==null){
            return root.left;
        }  
            Node Is=findInordersuccessor(root.right);
            root.data=Is.data;
                root.right=delete(root.right, Is.data);
        
            }
        return root;
    
}
public static Node createmirror(Node root){
    if(root==null){
        return null;
    }
     Node leftmirror=createmirror(root.left);
     Node rightmirror=createmirror(root.right);
     root.left=rightmirror;
     root.right=leftmirror;
     return root;
}
public static void preorder(Node root){
    if(root==null){
        return;
    }
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
}
public static boolean isvalidBst(Node root,Node min,Node max){
    if(root==null){
        return true;
    }
    if(min!=null&&root.data<=min.data){
        return false;
    }
    else if(max!=null && root.data>=max.data){
        return false;
    }
    return isvalidBst(root.left, min, root)&&isvalidBst(root.right, root, max);

}
public static void PrintInRange(Node root,int key1,int key2){
    if(root.data<=key1 && root.data>=key2){
        PrintInRange(root.left,key1,key2);
        System.out.print(root.data);
        PrintInRange (root.right,key1,key2);
    }
    else if(root.data<key1){
        PrintInRange(root.left,key1,key2);
    }
    else{
        PrintInRange(root.right,key1,key2);
    }
}
public static Node  findInordersuccessor(Node root){
    while(root.left!=null){
        root=root.left;
    }
    return root;
}
    public static void main(String[] args) {
    //     int values[]={5,1,3,4,2,7,8,9,10};
    //     Node root=null;
    //     for(int i=0; i<values.length; i++){
    //         root=insert(root,values[i]);
    //     }
    //     inorder(root);
    //     System.out.println();
    // //    PrintInRange(root,5,12);
    // if(isvalidBst(root, null, null)){
    //     System.out.println("valid");
    // }
    // else{
    //     System.out.println("Not valid");
    // }
    // }
    Node root=new Node(8);
    root.left=new Node(5);
    root.right=new Node(10);
    root.left.left=new Node(3);
    root.left.right=new Node(6);
    root.right.right=new Node(11);
    root=createmirror(root);
    preorder(root);
    }   
}
