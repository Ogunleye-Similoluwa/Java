package chap16;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Double> queue = new PriorityQueue<> ();
        queue.offer(3.2);
        queue.offer(9.4);
        queue.offer(5.4);

        while (queue.size() > 0) {
            System.out.printf("%.1f ", queue.peek());
            queue.poll();
        }
    }
}
