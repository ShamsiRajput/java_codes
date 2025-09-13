class node{
    int data;
    node next;
    node prev;

    public node(int data) {
        this.data = data;

    }
}
class circular{
    node head,tail;

    void insertstrt(int data) {
        node newnode = new node(data);
        if(head == null){
            head=tail=newnode;

        }
        else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
            newnode.prev=tail.next;
            tail.next=head;
            tail.next=head.prev;

        }
    }
    void insertatlast(int data){
        node newnode=new node(data);
        if(head==null){
            head=tail=newnode;
        }else{
            newnode.prev=tail;
            tail.next=newnode;
            tail=newnode;
            newnode.next=null;

        }


        }
        void deleteatstart(){
        if(head==null){
            return;

        }
        if(head==tail){
            head=tail=null;

        }
        else{
            head.next=head;
            head.prev =null;
        }
        }
        void deleteatlast(){
        if(head==null){
            return;
        }
        if(head==tail){
            head=tail=null;

        }
        else{
            tail.prev=tail;
            tail.next=null;
        }
        }
    }

