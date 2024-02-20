import ds.Tree.Tree;
import ds.nodes.TreeNode;

class Main{
    public static void main(String[]args){

        int n =1000;
        TreeNode node =new TreeNode(0,null,null);
        Tree tree = new Tree(node);

        for(int i=0;i<n;i++){tree.add(new TreeNode(i,null,null),tree.node);}

        System.out.print(tree.searsh(80,node));



        }
}