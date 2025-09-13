import java.util.PriorityQueue;

 class SimplePriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        PriorityQueue<String> pq = new PriorityQueue<>();

        // Add some numbers to the queue
        pq.add("shamsi");
        pq.add("yasir");
        pq.add("irfan");
        pq.add("aryan");
        pq.offer("mininster sab");
       // pq.poll();
        System.out.println(pq.element());
        System.out.println(pq.peek());

//        // Print and remove elements one by one
//        System.out.println("PriorityQueue elements in order:");
//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll()); // Retrieves and removes the head
// }
}
}










