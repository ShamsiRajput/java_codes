import jdk.jshell.EvalException;

class queue{


    int[]arr;
    int size;
    int front;
    int rear;


    queue(int size){


        this.size=size;
        arr=new int[size];
        front=0;
        rear=-1;



    }

    boolean isEmpty(){

        return front>rear;



    }
    boolean isFull(){

        return rear==size-1;



    }

    void enqueue(int value) {

        if (isFull()) {

            System.out.println("the Queue is full so we dont add this: " + value);


        }else{
        arr[++rear] = value;


    }
    }
    void dequeue(){
        if(isEmpty()){
            System.out.println("No any data in queue:");



        }else{

            System.out.println("dequeue: "+ arr[front] );
           front++;



        }




    }


    void display(){


        if(isEmpty()){

            System.out.println("queue is empty[]!");



        }else{


            for(int i=front;i<=rear;i++){

                System.out.print(arr[i]+ " ");


            }


        }


    }




    public static void main(String[] args) {

        queue obj=new queue(5);
        obj.enqueue(56);
        obj.enqueue(78);
        obj.enqueue(23);

        obj.display();

        obj.dequeue();
        obj.display();





    }



}