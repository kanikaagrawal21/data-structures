import java.util.Stack;

public class QueueUsingTwoStack {
    Stack<Integer> stack1= new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public void enqueue(int data) {
        stack1.push(data);
        System.out.println("enqueued" + data);

    }
    public int dequeue(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("queue is empty!");
            return -1;
        }

        if(stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    public void display(){
        System.out.println(stack1);
        System.out.println(stack2);
    }
    public static void main(String[] args){
        QueueUsingTwoStack queue = new QueueUsingTwoStack();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(40);
        queue.enqueue(60);
        queue.display();
        System.out.println("dequeued"+queue.dequeue());
        queue.display();

    }
}
