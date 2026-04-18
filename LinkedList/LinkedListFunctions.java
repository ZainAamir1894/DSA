class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
    public class LinkedListFunctions{

        //Creating a new node and inserting it at start
        public static Node InsertAtStart(Node head, int data){
            
            Node newNode = new Node(data);
            newNode.next = head;   
            return newNode;
        }

        //Creating a new node and inserting it at the end
        public static Node InsertAtEnd(Node node3, int data){
            Node nodeG = new Node(data);
            node3.next = nodeG;
            return nodeG;
        }

        //Creating a new node and inserting it between 
         public static void InsertInBetween(Node prev, int data){

            if (prev == null) return;

            Node nodeF = new Node(data);
            nodeF.next = prev.next;
            prev.next = nodeF;
        } 

        //Traversing and Printing the Final LinkedList
         public static void PrintList(Node head){
            Node temp = head;
            while(temp != null){
                
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
         }

        public static void main(String[] args) {
            Node node1 = new Node(10);
            Node node2 = new Node(20);
            Node node3 = new Node(30);

            node1.next = node2;
            node2.next = node3;

            //Reassigning head (node1)
            node1 = InsertAtStart(node1, 40);
            InsertAtEnd(node3, 50);
            InsertInBetween(node2, 60);

            PrintList(node1);
        }
    }
