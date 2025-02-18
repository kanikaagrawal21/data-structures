public class InventoryManagementLL {
    class Node {
        Node next;
        int itemId;
        String itemName;
        int quantity;
        int price;

        Node(int itemId, String itemName, int quantity, int price) {
            this.itemId = itemId;
            this.itemName = itemName ;
            this.quantity = quantity;
            this.price = price;
        }
    }
    private Node head;
    private int size;

    InventoryManagementLL() {
        this.size = 0;
    }

    //temp --> 1 -- 2 -- 3
    public void insertBeginning(int itemId, String itemName, int quantity, int price) {
       Node temp = new Node( itemId,  itemName,  quantity,  price);
        if (this.size == 0) {
            this.head = temp;
            size++;
            return;
        }
        temp.next = head;
        head = temp;
        size++;

    }

    public void insertLast(int itemId, String itemName, int quantity, int price) {
       Node temp = new Node( itemId,  itemName,  quantity,  price);
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

    public void insertAt(int itemId, String itemName, int quantity, int price,int pos) {
       Node temp = new Node( itemId,  itemName,  quantity,  price);
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
    public void deleteByItemId(int itemId) {
     Node ite = head;
        Node prev = head;
        while (ite != null) {
            if (ite.itemId == itemId) {
                break;
            }
            prev = ite;
            ite = ite.next;
        }

        prev.next = ite.next;
        size--;
    }
    public void updateByItemId(int itemId, int quantity) {
        Node ite = head;
        while (ite != null) {
            if (ite.itemId == itemId) {
                break;
            }
            ite = ite.next;
        }

        ite.quantity = quantity;
    }
    public void searchByItemId(int itemId){
        Node ite = head;
        while (ite != null) {
            if (ite.itemId == itemId) {
                break;
            }
            ite = ite.next;
        }

        System.out.println(ite.itemId);
        System.out.println(ite.itemName);
        System.out.println(ite.quantity);
        System.out.println(ite.price);
    }
    public void display() {
        Node ite = head;
        int totalPrice =0;
        while (ite!=null) {
           totalPrice += ite.quantity* ite.price;

            ite = ite.next;
        }
        System.out.println(totalPrice);
    }

}
