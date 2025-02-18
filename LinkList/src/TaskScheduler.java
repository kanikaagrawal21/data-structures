public class TaskScheduler {
    class Node{
        Node next;

        int taskId;
        String taskName;
        int priority;
        int dueDate;

        public Node(String taskName,int taskId,int priority,int dueDate) {
            this.taskName = taskName;
            this.taskId=taskId;
            this.dueDate=dueDate;
            this.priority=priority;

        }
    }
    Node head;
    Node tail;
    int size ;
    TaskScheduler(){
        size=0;
    }
    public void insertBeginning(String taskName,int taskId,int priority,int dueDate) {
        Node temp = new Node(taskName, taskId, priority, dueDate);
        if (this.size == 0) {
            this.head = temp;
            this.tail=temp;
            temp.next=temp;
            size++;
            return;
        }
        temp.next = head;
        head = temp;
        tail.next = head;
        size++;

    }

    public void insertLast(String taskName,int taskId,int priority,int dueDate) {
        Node temp = new Node(taskName, taskId, priority, dueDate);
        if (this.size == 0) {
            this.head = temp;
            this.tail=temp;
            temp.next=temp;
            size++;
            return;
        }

        Node ite = head;

        while(ite.next != head) {
            ite = ite.next;

        }

        ite.next = temp;
        temp.next=head;
        tail=temp;
        size++;
    }

    //1 --- 2 --7- 3 --- 4--- 5

    public void insertAt(String taskName,int taskId,int priority,int dueDate,int pos) {
     Node temp = new Node(taskName, taskId, priority, dueDate);
        if (this.size == 0) {
            this.head = temp;
            size++;
            return;
        }

        Node ite = head;
        for (int i=0; i<pos-2; i++) {
            ite = ite.next;
        }
        temp.next = ite.next;
        ite.next = temp;
        size++;

    }
    public void deleteByTaskID(int taskId ){
       Node ite = head;
       Node prev = head;
        while (ite != null) {
            if (ite.taskId == taskId) {
                break;
            }
            prev = ite;
            ite = ite.next;
        }
        if(ite==tail){
            tail = prev;
        }
        if (ite==head){
            head = ite.next;
        }


        prev.next = ite.next;
        size--;
    }
    public void searchByPriority(int priority) {
       Node ite = head;
        while (ite != tail) {
            if (ite.priority == priority) {
                break;
            }
            ite = ite.next;
        }

        System.out.println(ite.taskName);
        System.out.println(ite.taskId);
        System.out.println(ite.priority);
        System.out.println(ite.dueDate);
    }
    public void display() {
       Node ite = head;
        while (ite!=tail) {
            System.out.print(ite.taskId);
            System.out.print(" ,");
            System.out.print(ite.taskName);
            System.out.print(" ,");
            System.out.print(ite.priority);
            System.out.print(" ,");
            System.out.print(ite.dueDate);
            System.out.print(" --> ");

            ite = ite.next;
        }
    }

}
