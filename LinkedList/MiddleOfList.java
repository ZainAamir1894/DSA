public class MiddleOfList {
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

    public Node middle(Node head){
        slow = fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        MiddleOfList m = new MiddleOfList();

        Node mid = m.middle(node1);

        if(mid != null){
            System.out.println("Middle Node: " + mid.data);
        }else{
            System.out.println("List empty");
        }
        
    }
}
