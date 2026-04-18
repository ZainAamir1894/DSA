class Queue{

    int[] arr = new int[5];
    int front = 0;
    int rear = -1;

    boolean isEmpty(){
        return front > rear;
    }

    boolean isFull(){
        return rear == arr.length-1;
    }

     void enqueue(int x){
        if(isFull()){
            System.out.println("Overflow!");
        }else{
            rear++;
            arr[rear] = x;
            System.out.println("Inserted: " + x + " into Array");
        }
    }

     void dequeue(){
        if(isEmpty()){
            System.out.println("Underflow!");
        }else{
            front++;
            int x = arr[front];
            System.out.println("Removed: " + x + " from Array");
        }
    }

    public static void main(String[] args) {

        /* Index: 0  1  2  
           Array: 10 20 30  

        
        For Dequeue:
        When front == rear it deletes the front element that is 20

        For Enqueue:
        When rear element reaches n-1 it becomes full and array overflows
        else if it doesn't the element keeps storing into the array as rear is used to insert
        
        
        */

        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.dequeue();

    }
}