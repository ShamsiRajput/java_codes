import java.sql.SQLOutput;
class queue {

    int[] arr;
    int size;
    int rear = -1;
    int front = 0;

    queue(int size) {

        this.size = size;
        arr = new int[size];
        rear = -1;
        front = 0;


    }

    boolean isEmpty() {


        return front > rear;


    }

    boolean isFull() {

        return rear==size-1;

    }

    void enqueue(int value) {
        if (isFull()) {

            System.out.println("queue is full so don't add this: " + value);


        } else {

            arr[++rear] = value;


        }


    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("array is empty[]");


        } else {

            System.out.println("dequeue" + arr[front]);
            front++;

        }


    }

    void peek(){


        System.out.println("peek values: "+arr[front]);
    }

    void display() {

        if (isEmpty()) {
            System.out.println("arr is empty[]");


        } else

            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
    }


    public static void main(String[] args) {

        queue obj = new queue(5);
        obj.enqueue(598);
        obj.enqueue(56);
        obj.enqueue(65);
        obj.enqueue(54);
        obj.display();
obj.enqueue(56);
        obj.dequeue();
        obj.enqueue(87);
        obj.display();
        System.out.println();
        obj.peek();

    }

}