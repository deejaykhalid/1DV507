package ko222gj_assign2.Queue;
import java.util.Iterator;
/**
 * An interface representing a simple Queue.
 * It support for accessing enqueue and dequeue object from the queue.
 * <p/>
 * The method used in the class is head to tail method.
 * <p/>
 */

/**
 *@author Khalid Oyebode.
 */

public class LinkedQueue implements QueueInterface{
	private int size = 0;
	private Node head = null;
	private Node tail = null;
	
	 /**
     * Method will return <code>size</code> of queue.
     */
	@Override
	public int size() {
		return size;
	}

	 /**
    * Method will return <code>0</code> for queue, if the queue is empty.
    * @return false
    */
	@Override
	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}

	 /**
    * Method will add object <code>element</code> for queue.
    */
	@Override
	public void enqueue(Object element){
		if(head == null) {
			head = new Node(element);
			tail = head;
		}else {
			tail.next = new Node(element);
			tail = tail.next;
		}
		size++;
	}

	 /**
    * Method will return and also remove the first object in queue.
    */
	@Override
	public Object dequeue(){
		check();
		Node temp = head;
		head = head.next;
		size--;
		return temp.value;
	}

	 /**
    * Method will return the the first object in queue.
    */
	@Override
	public Object first(){
		check();
		return head.value;
	}
	 /**
	    * Method will return the last object in queue.
	    */
	@Override
	public Object last(){
		check();
		return tail.value;
	}
	 /**
	    * Will return the objects in the queue.
	    */
	@Override
	public String toString(){
		String output = "[ ";
		Iterator<Object> it = iterator();
		while (it.hasNext()) {
			Object n = it.next();
			output += n + " "; 
		}
		output += "]";
		return output;
	}
	 /**
	    * Returns a special iterator for queue.
	    */
	@Override
	public Iterator<Object> iterator() {
		return new QueueIterator();
	}
	
	/* Private inner class used by iterator() */
	private class QueueIterator implements Iterator<Object> {
		private Node node = head;
		public Object next(){
			Object val = node.value;
			node = node.next;
			return val;
		}
		
		public boolean hasNext(){
			return node != null;
		}
		 /**
		    * Method is not used in queue.
		    * <p/>
		    * Throws <code>RuntimeExecption</code>
		    */
		public void remove(){throw new RuntimeException("Removing() is not implemented");
		}

	}
	
	private class Node {
		Object value;
		Node next = null;
		
		Node(Object element) {
			value = element;
		}
	}
	/**
	    * Method check if queue is empty.
	    * <p/>
	    * Throws <code>RuntimeExecption</code>
	    */
	private void check() {
		if(isEmpty()){
			throw new RuntimeException("Queue is empty");
		}
	}
}

