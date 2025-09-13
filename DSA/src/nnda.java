//class Node{
//
//    int data;
//    Node next,prev;
//
//   public Node(int data){
//      this.data=data;
//      this.prev=this.next=null;
//
//   }}
//    class Doubly {
//
//        private Node head;
//        private Node tail;
//
//
//        public void insertAtStart(int data) {
//
//            Node newNode = new Node(data);
//            if (head == null) {
//
//                head = tail = newNode;
//
//            } else {
//
//                head = newNode;
//                head.next = newNode.next;
//                head.prev = newNode;
//            }
//
//
//        }
//
//
//    }
//
//
//public class nnda {
//
//
//    public static void main(String[] args) {
//        Doubly ls=new Doubly();
//        ls.insertAtStart(34);
//        ls.insertAtStart(4);
//        ls.insertAtStart(5);
//
//        System.out.println(ls);
//
//
//
//    }
//}
