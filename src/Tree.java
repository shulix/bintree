public class Tree {
    BSTNode RootNode;
    public   BSTNode Search(BSTNode root, int key) {
        if (root == null || root.key == key)
            return root;
        if (root.key < key)
            return Search(root.right, key);
        return Search(root.left, key);
    }
    public Tree(BSTNode rootNode) {
        RootNode = rootNode;
    }
    public BSTNode insert(int value){
        return insertRecursive(value,this.RootNode);
    }
    private BSTNode  insertRecursive(int value, BSTNode node){
        if(node==null){
            return new BSTNode(value);
        }
        if(value<node.key){
            node.left = insertRecursive(value,node.left);
        }else if (value> node.key){
            node.right = insertRecursive(value,node.right);
        }
        else{
            return node;
        }
        return node;
    }
