package ko222gj_assign2.Queue;

import java.util.Iterator;

public class ArrayQueue implements QueueInterface{
	private Object[] queue;
	private int first;
	private int last;
	private int size;
	
	public ArrayQueue(){
		queue = new Object[8];
		first = 0;
		last = 0;
		size = 0;
	}
	
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}
	
	@Override
	public void enqueue(Object element){
		if(size == queue.length){
			resize();
		}
		
		queue[last] = element;
		last = (last + 1) % queue.length;
		size++;
	}
	
	@Override
	public Object dequeue(){
		check();
		Object output = queue[first];
		queue[first] = null;
		first = (first+1) % queue.length;
		size--;
		
		return output;
	}

	@Override
	public Object first(){
		check();
		return queue[first];
	}
	
	@Override
	public Object last(){
		check();
		return queue[last - 1];
	}
	
	@Override
	public String toString() {
		String output = "[ ";
		int count = 0;
		
		while(count < queue.length){
			if(queue[count] != null){
				output += queue[count].toString() + " ";
			}
			count++;
		}
		return output + "]";
	}
	@Override
	public Iterator<Object> iterator() {
		return new ArrayQueueIterator();
	}
	
	private void  resize() {
		Object[] tmp = new Object[2*queue.length];
		for(int count = 0; count < size; count++) {
			tmp[count] = queue[first];
			first=(first+1) % queue.length;
		}
		first = 0;
		last = size;
		queue = tmp;
	}
	private void check() {
		if(isEmpty()){
			throw new RuntimeException("Queue is empty");
		}
	}
	
	class ArrayQueueIterator implements Iterator<Object> {
		private int count = 0;
		public Object next() {return queue[count++];}
		public boolean hasNext() {return count<size;}	
		public void remove() {
			throw new RuntimeException("The remove() will not be implemented");
		}
	}
}

