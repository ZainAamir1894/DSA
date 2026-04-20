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

        public static Node DeleteAtBeginning(Node head){

            if(head == null){
                System.out.println("List is Empty");
                return null;
            }else{
                int x = head.data;
                head = head.next;

                System.out.println("Deleted: " + x);
                return head;
                
            }
        }

        public static Node DeleteAtEnd(Node head){
            Node temp = head;

            if(head == null){
                System.out.println("List is Empty");
                return null;
            }

            //If list has only one node
            if(head.next == null){ 
                System.out.println("Deleted: " + head.data);
                return null;
            }

            while(temp.next.next != null){
                temp = temp.next;
            }
            System.out.println("Deleted: " + temp.next.data);
            temp.next = null;
            return head;
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


            LinkedListFunctions l = new LinkedListFunctions();

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

            node1 = DeleteAtBeginning(node1);
            node1 = DeleteAtEnd(node1);
        }
    }
