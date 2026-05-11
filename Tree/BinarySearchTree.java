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

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);

        tree.Traversal();
    }
}