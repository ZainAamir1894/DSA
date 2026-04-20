public class LinkedListCycle{

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node slow = null;
    Node fast = null;

    public boolean hasCycle(Node head){
        slow = fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){ //if cycle exists 
                return true;
            }
        }
        return false; //if it doesn't
    }

    public static void main(String[] args) {
        Node node1 = new Node(3);
        Node node2 = new Node(2);
        Node node3 = new Node(0);
        Node node4 = new Node(-4);


        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

       // node4.next = node2; //Cycle

        LinkedListCycle l = new LinkedListCycle();
        boolean result = l.hasCycle(node1);
        System.out.println("Cycle present: " + result);

    }
  
}