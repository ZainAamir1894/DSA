class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}

public class BinarySearchTree{
    Node root;


    public void insert(int data){


        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data){

        if(root == null){
            root = new Node(data);

        }else if(data < root.data){
            root.left = insertRec(root.left, data);

        } else if(data > root.data){
            root.right = insertRec(root.right, data);

        }
        return root;

    }

    public void Traversal(){

         TravRec(root);
    }

    public void TravRec(Node root){
        

        //InOrder Traversal
        if(root != null){
            TravRec(root.left);
            System.out.print(root.data + " ");
            TravRec(root.right);
        }

    }

    //Find the largest from left subtree
    public Node inOrderPredecessor(Node root){
        root = root.left;
        while(root.right != null){
            root = root.right;
        }
        return root;

    }

    public Node deleteNode(Node root, int value){
        if (root == null) return null;

    if (value < root.data) {
        root.left = deleteNode(root.left, value);
    }

    else if (value > root.data) {
        root.right = deleteNode(root.right, value);
    }

    else {
        //leaf
        if (root.left == null && root.right == null) {
            return null;
        }

        //one child
        else if (root.left == null) {
            return root.right;
        }
        else if (root.right == null) {
            return root.left;
        }

        //two children
        else {
            Node temp = inOrderPredecessor(root);
            root.data = temp.data;
            root.left = deleteNode(root.left, temp.data);
        }
        
        }
        return root;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);

        tree.Traversal();

        tree.root = tree.deleteNode(tree.root , 7);

        System.out.println();
        System.out.println("New Tree: ");
        tree.Traversal();
    }
}