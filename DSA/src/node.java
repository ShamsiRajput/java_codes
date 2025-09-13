// Node class for Doubly Linked List
class Node {
    int data;
    Node prev, next;

    public Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

// Doubly Linked List class
class DoublyLinkedList {
    private Node head;
    private Node tail;

    // Insert a node at the start of the list
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert a node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Insert a node in sorted order
    public void insertInOrder(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data >= data) {
            insertAtStart(data);
            return;
        }
        if (tail.data <= data) {
            insertAtEnd(data);
            return;
        }

        Node current = head;

        while (current.next != null && current.next.data < data) {
            current = current.next;
        }

        newNode.next = current.next;
        newNode.prev = current;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
    }

    // Delete the first node
    public void deleteAtStart() {
        if (head == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Delete the last node
    public void deleteAtEnd() {
        if (tail == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Delete a node with a specific value
    public void deleteValue(int data) {
        Node current = head;

        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    deleteAtStart();
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    deleteAtEnd(); // If deleting the last node
                }

                return; // Exit after deleting the first occurrence
            }
            current = current.next;
        }
    }

    // Traverse and print the list from head to tail
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // Main method for testing
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtEnd(10);
        dll.insertAtStart(30);
        dll.insertAtEnd(40);
        dll.insertInOrder(20);
        dll.insertInOrder(35);

        System.out.print("List after insertions: ");
        dll.traverse(); // Output: 10 <-> 20 <-> 30 <-> 35 <-> 40 <-> NULL

        dll.deleteAtStart();
        System.out.print("After deleting start: ");
        dll.traverse(); // Output: 20 <-> 30 <-> 35 <-> 40 <-> NULL

        dll.deleteAtEnd();
        System.out.print("After deleting end: ");
        dll.traverse(); // Output: 20 <-> 30 <-> 35 <-> NULL

        dll.deleteValue(30);
        System.out.print("After deleting 30: ");
        dll.traverse(); // Output: 20 <-> 35 <-> NULL
    }
}
