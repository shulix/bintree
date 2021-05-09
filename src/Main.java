public class Main {
    public static void main(String[] args) {
      Tree bst=new Tree(new BSTNode(0));
​
      bst.insert(5);
      bst.insert(2);
      bst.insert(6);
      bst.insert(9);
      bst.insert(4);
      bst.insert(51);
      bst.insert(9);
      bst.insert(3);
      bst.insert(66);
      bst.insert(-66);
      bst.insert(-4);
      bst.insert(-1);
      bst.insert(-2);
        System.out.println();
    }
}
