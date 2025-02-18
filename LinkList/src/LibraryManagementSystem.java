public class LibraryManagementSystem {
    class Node {
        Node next;
        Node prev;
        String bookTitle;
        String author;
        String genre;
        int bookId;
        String AvailabilityStatus;

        Node(String bookTitle, String author, String genre, int bookId, String availabilityStatus) {
            this.author = author;
            this.bookTitle = bookTitle;
            this.genre = genre;
            this.bookId = bookId;
            this.AvailabilityStatus = availabilityStatus;

        }
    }

    Node head;
    int size;

    LibraryManagementSystem() {
        size = 0;
    }

    public void insertBeginning(String bookTitle, String author, String genre, int bookId, String availabilityStatus) {
       Node temp = new Node(bookTitle, author, genre,  bookId,  availabilityStatus);
        if (this.size == 0) {
            this.head = temp;
            size++;
            return;
        }
        temp.next = head;
        head.prev = temp;
        head = temp;
        size++;

    }

    public void insertLast(String bookTitle, String author, String genre, int bookId, String availabilityStatus) {
       Node temp = new Node(bookTitle, author, genre,  bookId,  availabilityStatus);
        if (this.size == 0) {
            this.head = temp;
            size++;
            return;
        }

        Node ite = head;

        while (ite.next != null) {
            ite = ite.next;
        }

        ite.next = temp;
        temp.prev = ite;
        size++;
    }

    //1 --- 2 --7- 3 --- 4--- 5

    public void insertAt(String bookTitle, String author, String genre, int bookId, String availabilityStatus, int pos) {
       Node temp = new Node(bookTitle, author, genre,  bookId,  availabilityStatus);
        if (this.size == 0) {
            this.head = temp;
            size++;
            return;
        }

        Node ite = head;
        for (int i = 0; i < pos - 2; i++) {
            ite = ite.next;
        }
        temp.next = ite.next;
        ite.next.prev = temp;
        ite.next = temp;
        temp.prev = ite;
        size++;

    }
    public void searchByBookTitle(String bookTitle) {
       Node ite = head;
        while (ite != null) {
            if (ite.bookTitle == bookTitle) {
                break;
            }
            ite = ite.next;
        }

        System.out.println(ite.bookTitle);
        System.out.println(ite.author);
        System.out.println(ite.bookId);
        System.out.println(ite.genre);
    }
    public void deleteByBookId(int bookId) {
        Node ite = head;
       Node prev = head;
        while (ite != null) {
            if (ite.bookId== bookId) {
                break;
            }
            prev = ite;
            ite = ite.next;

        }

        prev.next = ite.next;
        ite.next.prev=prev;
        size--;
    }
}