package priorityqueue;
import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(4);
		pq.offer(2);
		pq.offer(1);
		pq.offer(7);
		pq.offer(5);
		//by default Min heap imoplemented hota hai
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		
		PriorityQueue<Integer> pqr = new PriorityQueue<Integer>(Comparator.reverseOrder());
		pqr.offer(4);
		pqr.offer(2);
		pqr.offer(1);
		pqr.offer(7);
		pqr.offer(5);
		//by default Max heap imoplemented hota hai
		System.out.println(pqr);
		System.out.println(pqr.peek());
		System.out.println(pqr.poll());
		System.out.println(pqr);

	}

}
