package queue_LinkedList;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue=new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println("dequeue: "+queue);
    }
}
