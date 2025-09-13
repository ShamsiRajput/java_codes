import java.util.Arrays;
import java.util.Queue;

class queue{
    int size;
    int [] arr;
    int rear;
    int front;

    queue(int size){

        arr=new int[size];
        this.size=size;
        rear=-1;
        front=0;
    }

    boolean isEmpty(){
        return front>rear;



    }
    boolean isFull(){

        return rear==size-1;

    }
    public void enqueue(int values){

        if(isFull()){
            System.out.println("array is full"+ values);

        }  else{


            arr[++rear]=values;

        }


    }
public  void dequeue(){

        if(isEmpty()){
            System.out.println("queue is emply");


        }else{
            System.out.println("Dequeue"+ arr[front]);
            front++;


        }




}


    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue contents: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    void peek(){

        System.out.println(arr[front]);


    }




    public static void main(String[] args) {

queue obj=new queue(5);
obj.enqueue(56);
obj.enqueue(36);
obj.enqueue(25);
        obj.display();
        obj.dequeue();
        obj.display();
        obj.peek();


    }


}