public class DetectCycle{
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

    public Node detCycle(Node head){
        slow = fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){     //slow and fast meet at -4
                Node temp = head; //reset head because they meet and keep fast at the meeting point                           

                while(temp != fast){
                    temp = temp.next; //temp moves to 2
                    fast = fast.next; //fast was at -4 now it moves to 2 ==> CYCLE DETECTED 
                }
                return temp;
            }
        }
        return null;

    }
    public static void main(String[] args) {
        Node node1 = new Node(3);
        Node node2 = new Node(2);
        Node node3 = new Node(0);
        Node node4 = new Node(-4);


        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

       node4.next = node2; //Cycle

       DetectCycle c = new DetectCycle();

       Node cycleStart = c.detCycle(node1);

       if(cycleStart != null){
        System.out.println("Cycle starts at value: " + cycleStart.data);
       } else{
        System.out.println("No Cycle detected");
       }
 
    }
}