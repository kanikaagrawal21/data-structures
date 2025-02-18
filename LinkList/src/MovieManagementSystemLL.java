public class MovieManagementSystemLL {
    class Node{
        Node prev;
        Node next;
        String movieTitle;
        String director;
        int year;
        float rating;

        Node(String movieTitle,String director,int year,float rating){
            this.movieTitle=movieTitle;
            this.director=director;
            this.year=year;
            this.rating=rating;

        }
    }
    Node head;
    int size;
    MovieManagementSystemLL(){
      size=0;
    }
    public void insertBeginning(String movieTitle,String director,int year,float rating) {
     Node temp = new Node( movieTitle, director, year, rating);
        if (this.size == 0) {
            this.head = temp;
            size++;
            return;
        }
        temp.next = head;
        head.prev = temp;
        head=temp;
        size++;

    }

    public void insertLast(String movieTitle,String director,int year,float rating) {
      Node temp = new Node( movieTitle, director, year, rating);
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
        temp.prev=ite;
        size++;
    }

    //1 --- 2 --7- 3 --- 4--- 5

    public void insertAt(String movieTitle,String director,int year,float rating,int pos) {
        Node temp = new Node( movieTitle, director, year, rating);
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
        ite.next.prev =temp;
        ite.next = temp;
        temp.prev=ite;
        size++;

    }
    public void deleteByMovieTitle(String movieTitle) {
        Node ite = head;
        Node prev = head;
        while (ite != null) {
            if (ite.movieTitle== movieTitle) {
                break;
            }
            prev = ite;
            ite = ite.next;

        }

        prev.next = ite.next;
        ite.next.prev=prev;
        size--;
    }
    public void searchByDirector(String director) {
       Node ite = head;
        while (ite != null) {
            if (ite.director == director) {
                break;
            }
            ite = ite.next;
        }

        System.out.println(ite.movieTitle);
        System.out.println(ite.director);
        System.out.println(ite.year);
        System.out.println(ite.rating);
    }
    public void updateByMovieTitle(String movieTitle, int rating) {
       Node ite = head;
        while (ite != null) {
            if (ite.movieTitle == ite.movieTitle) {
                break;
            }
            ite = ite.next;
        }

        ite.rating = rating;
    }

}
