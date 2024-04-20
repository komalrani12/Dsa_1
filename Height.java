public class Height {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int heightBinarytree(Node root){
        if(root==null){
            return 0;
        }
        int  lh=heightBinarytree(root.left);
        int  rh=heightBinarytree(root.right);
        return Math.max(lh,rh)+1; 

    } 
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int lcount=count(root.left);
        int rcount=count(root.right);
        return lcount+rcount+1;
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sum(root.left);
        int rightsum=sum(root.right);
        return leftsum+rightsum+root.data;
    }
    public static int diameter2(Node root){
        if(root==null){
            return 0;
        }
        int leftdiam=diameter2(root.left);
        int leftht=heightBinarytree(root.left);
        int rightdiam=diameter2(root.right);
        int rightht=heightBinarytree(root.right);
        int selfdiam=leftht+rightht+1;
        return Math.max(selfdiam,Math.max(leftdiam,rightdiam));
    }
    static class info{
        int diam;
        int ht;
        public info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;

        }
    }
    public static info diameter( Node root){
        if(root==null){
            return new info(0,0);
        }
        info leftinfo=diameter(root.left);
        info rightinfo=diameter(root.right);
        int diam=Math.max(Math.max(leftinfo.diam,rightinfo.diam),leftinfo.ht+rightinfo.ht+1);
        int ht=(leftinfo.ht+rightinfo.ht)+1;
        return new info(diam, ht);




    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
    //    System.out.println( heightBinarytree(root));
    //    System.out.println(count(root)); 
    //    System.out.println(sum(root));
    //    System.out.println("diameter");
    //    System.out.println(diameter(root));
       System.out.println(diameter(root).diam);
       System.out.println(diameter(root).ht);
    } 
}
