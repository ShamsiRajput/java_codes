//class Node{
//
//    int data;
//    Node prev,next;
//
//    Node(int data){
//        this.data=data;
//        this.next=this.prev=null;
//
//
//    }
//
//}
//class doubly{
//    private Node head;
//    private Node tail;
//
//    public void insertStart(int data){
//
//        Node newNode=new Node(data);
//        if(head==null){
//
//            head=newNode;
//            tail=newNode;
//
//        }
//        else{
//
//            head.prev=newNode;
//            newNode.next=head;
//            head=newNode;
//
//        }
//
//
//    }
//    public void InsrtEnd(int data) {
//
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = tail = newNode;
//
//
//        } else {
//
//            tail.next = newNode;
//            newNode.prev = tail;
//            tail = newNode;
//
//        }
//
//
//    }
//public void delstart(){
//
//        if(head==null)
//            return;
//        if(head==tail){
//            head=tail=null;
//    }else {
//head=head.next;
//head.prev=null;
//
//
//        }
//
//
//
//}
//public void dellend(){
//
//        if(tail==null)
//            return;
//        if(head==tail){
//
//            head=tail=null;
//
//        }else{
//
//            tail=tail.prev;
//            tail.next=null;
//
//
//
//        }
//
//
//}
//
//
//}
//
//
//
//
//
//public class Mian2 {
//
//    public static void main(String[] args) {
//
//    }
//
//}
