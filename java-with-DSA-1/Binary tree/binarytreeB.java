import org.w3c.dom.traversal.NodeFilter;

public class binarytreeB {
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
    static class Binarytree{
        static int idx=-1;
        public static Node buildBinary(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnNode=new Node(nodes[idx]);
            newnNode.left=buildBinary(nodes);
            newnNode.right=buildBinary(nodes);
            return newnNode;
        }  
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree=new Binarytree();
        Node root=tree.buildBinary(nodes);
        System.out.println(root.data);
    }
}