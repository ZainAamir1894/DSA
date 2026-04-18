//Enqueuing and Dequeuing using a LinkedList

class QueueUsingLinkedList{
    class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

}

    Node front = null;
    Node rear = null;

    void enqueue(int x){
        Node newNode = new Node(x);

        if(front == null && rear == null){
            front = rear = newNode;
        } else{
            //Suppose List is not empty
            rear.next = newNode;
            rear = newNode;
        }
    }

    void dequeue(){
        if(front == null && rear == null){
            System.out.println("Underflow!");
        }else{
            int x = front.data;
            front = front.next;

            if(front == rear){
                front = rear = null;
            }

            System.out.println("Removed: " + x);
        }
    }

    void display(){
        if(front == null && rear == null){
            System.out.println("null");
        } else{
           Node temp = front;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {


        QueueUsingLinkedList q = new QueueUsingLinkedList();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.dequeue();

        q.display();

        
    }
}
