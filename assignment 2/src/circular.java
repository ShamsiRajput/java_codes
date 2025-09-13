import java.util.Scanner;

class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class CircularDoublyLinkedList {
    private Node head;

    public CircularDoublyLinkedList() {
        this.head = null;
    }

    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
        }
    }

    public int removeFromFront() {
        if (head == null) return -1;
        int data = head.data;
        if (head.next == head) {
            head = null;
        } else {
            head.prev.next = head.next;
            head.next.prev = head.prev;
            head = head.next;
        }
        return data;
    }
    public int removeFromEnd() {
        if (head == null) return -1;
        if (head.next == head) {
            int data = head.data;
            head = null;
            return data;
        } else {
            Node last = head.prev;
            int data = last.data;
            last.prev.next = head;
            head.prev = last.prev;
            return data;
        }
    }

    public boolean search(int value) {
        if (head == null) return false;
        Node tmp = head;
        do {
            if (tmp.data == value) return true;
            tmp = tmp.next;
        } while (tmp != head);
        return false;
    }

    public void display() {
        if (head == null) return;
        Node tmp = head;
        do {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        } while (tmp != head);
        System.out.println();
    }

    public static void main(String[] args) {

        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        Scanner input=new Scanner(System.in);
        int type,values;

        System.out.println("1•\t nsertAtFront(Type) \n" +
                "2•\t insertAtEnd(Type) \n" +
                "3•\t removeFromFront() \n" +
                "4•\t removeFromEnd() \n" +
                "5•\t Search \n" +
                "6•\t Display() \n");

        type=input.nextInt();


        if(type==1){
            System.out.println("enter the insert in start values:");
            values=input.nextInt();
            list.insertAtFront(values);
            list.display();

        } else if (type==2) {
            System.out.println("enter the insert in end values:");
            values=input.nextInt();
            list.insertAtEnd(values);

            list.display();
        } else if (type==3) {

            list.removeFromFront();
            list.display();

        } else if (type==4) {
            list.removeFromEnd();
            list.display();

        } else if (type==5) {
            System.out.println("enter the searcht values:");
            values=input.nextInt();
            list.search(values);


        } else if (type==6) {
            list.display();

        }


    }
}