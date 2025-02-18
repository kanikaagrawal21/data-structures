public class StudentRecordLL {

    class Node {
        Node next;
        int rollNum;
        String name;
        int age;
        char grade;

        Node(int rollNum, String name, int age, char grade) {
            this.rollNum = rollNum;
            this.name = name;
            this.age = age;
            this.grade = grade;
        }
    }

    private Node head;
    private int size;

    StudentRecordLL() {
        this.size = 0;
    }

    //temp --> 1 -- 2 -- 3
    public void insertBeginning(int rollNum, String name, int age, char grade) {
        Node temp = new Node(rollNum, name, age, grade);
        if (this.size == 0) {
            this.head = temp;
            size++;
            return;
        }
        temp.next = head;
        head = temp;
        size++;

    }

    public void insertLast(int rollNum, String name, int age, char grade) {
        Node temp = new Node(rollNum, name, age, grade);
        if (this.size == 0) {
            this.head = temp;
            size++;
            return;
        }

        Node ite = head;

        while(ite.next != null) {
            ite = ite.next;
        }

        ite.next = temp;
        size++;
    }

    //1 --- 2 --7- 3 --- 4--- 5

    public void insertAt(int rollNum, String name, int age, char grade, int pos) {
        Node temp = new Node(rollNum, name, age, grade);
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
    //1 --- 2 --7- 3 --- 4 --- 5
    public void deleteByRoll(int rollNum) {
        Node ite = head;
        Node prev = head;
        while (ite != null) {
            if (ite.rollNum == rollNum) {
                break;
            }
            prev = ite;
            ite = ite.next;
        }

        prev.next = ite.next;
        size--;
    }

    public void searchByRoll(int rollNum) {
        Node ite = head;
        while (ite != null) {
            if (ite.rollNum == rollNum) {
                break;
            }
            ite = ite.next;
        }

        System.out.println(ite.rollNum);
        System.out.println(ite.name);
        System.out.println(ite.age);
        System.out.println(ite.grade);
    }

    public void updateByRoll(int rollNum, char grade) {
        Node ite = head;
        while (ite != null) {
            if (ite.rollNum == rollNum) {
                break;
            }
            ite = ite.next;
        }

        ite.grade = grade;
    }

    public void display() {
        Node ite = head;
        while (ite!=null) {
            System.out.print(ite.rollNum);
            System.out.print(" ,");
            System.out.print(ite.name);
            System.out.print(" ,");
            System.out.print(ite.age);
            System.out.print(" ,");
            System.out.print(ite.grade);
            System.out.print(" --> ");

            ite = ite.next;
        }
    }

}
