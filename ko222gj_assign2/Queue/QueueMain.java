package ko222gj_assign2.Queue;

public class QueueMain {

	public static void main(String[] args) {
		LinkedQueue link = new LinkedQueue();
		for(int i = 0; i <= 10; i++){
			link.enqueue(i);
		}
		System.out.println("==========================================");
		System.out.println("Linked Queue: " + link.toString());
		System.out.println("Current size: " + link.size());
		System.out.println("Is the queue empty: " + link.isEmpty());
		System.out.println("First element: " + link.first());
		System.out.println("The Last element: " + link.last());
		System.out.println("Removing element: " + link.dequeue());
		System.out.println("Current queue: "+ link.toString());
		
		System.out.println("==========================================");
		
		ArrayQueue arr = new ArrayQueue();
		for(int i = 0; i < 5; i++){
			arr.enqueue(i);
		}
		System.out.println("The Current Queue: "+ arr.toString());
		System.out.println("The First element:" + arr.first());
		System.out.println("Last element:" + arr.last());
		System.out.println("Removing the element: " + arr.dequeue());
		System.out.println("Removing the element: " + arr.dequeue());
		System.out.println("Removing the element: " + arr.dequeue());
		System.out.println("Current Queue: "+ arr.toString());
		System.out.println("Current size: " + arr.size());
		System.out.println("Is the queue empty: " + arr.isEmpty());
		System.out.println("First element:" + arr.first());
		System.out.println("Last element:" + arr.last());
		arr.enqueue(7);
		arr.enqueue(8);
		arr.enqueue(9);
		arr.enqueue(10);
		System.out.println("The Current Queue: "+ arr.toString());
		System.out.println("The First element:" + arr.first());
		System.out.println("The Last element:" + arr.last());
		arr.enqueue(11);
		System.out.println("The Current Queue: "+ arr.toString());
		System.out.println("==========================================");
	}

}
