public class BSTree_test {
    public static void main(String[] args){
        Node root = null;
        BSTree bst = new BSTree();
        root = bst.insert(root, 10);
        root = bst.insert(root, 20);
        root = bst.insert(root, 30);

        System.out.printf("\nFirst Tree\n");
        bst.inorder(root);

        root = bst.deleteNode(root, 50);
        root = bst.deleteNode(root, 70);
        System.out.printf("\nSecond Tree\n");
        bst.inorder(root);
    }
}
