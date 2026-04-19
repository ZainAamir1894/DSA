//Implementation of DoublyLinkedLists

class DoublyList{
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node temp = null;

    void create(int x){
        Node newNode = new Node(x);

        newNode.prev = null;
        newNode.next = null;

        if(head == null){
            head = temp = newNode; //if empty then connect to 1st node
        }else{
            temp.next = newNode; //Contains 200 
            newNode.prev = temp; //Connects previous of 2nd node to 1st (100)
            temp = newNode; //moves to 2nd node
        }
    }

    void display(){
        Node i = head;
        while(i != null){
            System.out.println(i.data);
            i = i.next;
        }
    }

    public static void main(String[] args){
        DoublyList l = new DoublyList();

        l.create(7);
        l.create(1);
        l.create(2);

        l.display();
    }
}
