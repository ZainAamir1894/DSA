
class StackedLinkedList{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    void push(int x){
        Node newNode = new Node(x);
        newNode.data = x;
        newNode.next = top;
        top = newNode;
    }

    void pop(){
        if(top == null){
            System.out.println("Underflow");
        }else{
            System.out.println("Removed element: " + top.data);
            top = top.next;
        }
    }

    void peek(){
        if(top == null){
            System.out.println("LinkedList is Empty!");
        }else{
            System.out.println("Peeking top element: " + top.data);
        }
    }

    void display(){
        Node temp = top;
        if(top == null){
            System.out.println("LinkedList is Empty");
        }else{

            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
    
        StackedLinkedList l = new StackedLinkedList();
        
        l.push(2);
        l.push(3);
        l.push(0);

        l.display(); //10,3,2
        l.peek(); //3
        l.display(); // 3,2
        
    }
}
