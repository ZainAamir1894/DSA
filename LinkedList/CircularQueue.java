public class CircularQueue{
    
    int n = 5;
    int[] arr = new int[n];
    int front = -1;
    int rear = -1;

   
    // Index: -1  0 1 2 3 4
    // Array     -1 2 5 6 7

    //In circular queue, after dequeuing the space behind is wasted to rear goes to 0 to enqueue

    void enqueue(int x){
        if(front == -1 && rear == -1){
            front = rear = 0;
            arr[rear] = x;
        } else if((rear + 1) % n ==  front){
            System.out.println("Queue is full, Overflow.");

            //Checks 0 + 1 % 5 = 1 then it is not equal to 0 (front) --> false


        } else{
            rear = (rear + 1) % n;
            arr[rear] = x;

            //rear = (rear + 1) % n decides index values in a circular way and stores 
        }
    }

    void dequeue(){
        if(front == -1 && rear == -1){
            System.out.println("Queue is empty, Underflow.");

        } else if(front == rear){
            front = rear = -1;
        } else{
            System.out.println("Removed: " + arr[front] + " from Queue");
            front = (front + 1) % n;
        }
    }

    void display(){
        
        if(front == -1 && rear == -1){
            System.out.println("Queue is Empty.");
            return;
        } 
            int i = front;
            while(true){
                System.out.println(arr[i]);
                if(i == rear) break;
                i = (i + 1) % n;
            }
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();

        q.enqueue(2);
        q.enqueue(-1);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);

        q.display();

        q.dequeue();

        
    }
}