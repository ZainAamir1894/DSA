
public class StackArray{
    int n = 5;
    int[] stack = new int[n];
    int top = -1;

    //Inserting 
    void push(int x){
        if(top == n-1){
            System.out.println("Overflow"); //Stack Full
        }else{
            top++;
            stack[top] = x;
        }
    }

    //Deleting
    void pop(){
        int item;
        if(top == -1){
            System.out.println("Underflow"); //Stack Empty
        }else{
            item = stack[top];
            top--; //because we'll starti inserting from the 1st index
            System.out.println("Removed From Stack: " + item);
        }
    }

    //Peeking 
    void peek(){
        if(top == -1){
            System.out.println("Stack Empty");
        } else{
            System.out.println(stack[top]);
        }
    }

    //Traversing and Displaying
    void display(){
        for(int i = top; i >= 0; i--){
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        StackArray s = new StackArray();

        s.push(5);
        s.push(1);
        s.push(6);
        s.push(2);

        s.pop();
        s.peek();

        s.display();
    }
}