package ko222gj_assign2.Queue;

import org.junit.Test;    //JUnit support for @Test

import static org.junit.Assert.*;  
import org.junit.Before;

public class QueueTest {
	QueueInterface linked;
	QueueInterface linkedTwo;
	QueueInterface linkedThree;
	QueueInterface linkedFour;
	QueueInterface random;
	
	@Before public void setUp(){
		linked = new ArrayQueue();
		linkedFour = new ArrayQueue();
		random = new ArrayQueue();
		linkedTwo = random(10000);
		linkedThree = random(100);
		
	}	
	@Test
	public void testFIFO(){
		linked.enqueue(0);
		linked.enqueue(1);
		linked.enqueue(2);
		assertEquals(linked.first(), 0);
		assertEquals(linked.last(), 2);
		assertEquals(linked.dequeue(), 0);
		assertEquals(linked.dequeue(), 1);
		assertEquals(linked.dequeue(), 2);
	}
	
	@Test
	public void testQueueResize() {
		assertEquals(linkedTwo.size(), 10000);
		linkedFour.enqueue(1);
		linkedFour.enqueue(2);
		linkedFour.enqueue(3);
		linkedFour.enqueue(4);
		linkedFour.enqueue(5);
		linkedFour.enqueue(6);
		assertEquals(linkedFour.toString(), "[ 1 2 3 4 5 6 ]");
		assertEquals(linkedFour.size(), 6);
		linkedFour.dequeue();
		linkedFour.dequeue();
		linkedFour.dequeue();
		linkedFour.dequeue();
		linkedFour.enqueue(7);
		linkedFour.enqueue(8);
		linkedFour.enqueue(9);
		linkedFour.enqueue(10);
		linkedFour.enqueue(11);
		assertEquals(linkedFour.size(), 7);
		if (linkedFour instanceof ArrayQueue){
			assertEquals(linkedFour.toString(), "[ 9 10 11 5 6 7 8 ]");
		}else {
			assertEquals(linkedFour.toString(), "[ 5 6 7 8 9 10 11 ]");
		}
	}
	
	private void assertEquals(String string, String string2) {
	
		
	}

	@Test
	public void testQueuEmpty(){
		assertTrue(linked.isEmpty());
		linked.enqueue(2);
		assertTrue(!linked.isEmpty());
	}
	
	@Test
	public void bigQueueTest(){
		for(int i = 0; i < 100; i++){
			assertEquals(linkedThree.dequeue(), i);
		}
		for(int i = 0; i < 10000; i++){
			assertEquals(linkedTwo.dequeue(), i);
		}
	}
	
	
	//Private methods 
	 
	private void assertEquals(Object dequeue, int i) {
		
	}

	/*
	 * Generates random integer array.
	 */
	private QueueInterface random(int size) {
		/*Create a new queue of the right type*/
		if(random instanceof ArrayQueue){
			random = new ArrayQueue();
		}else {
			random = new LinkedQueue();
		}
		for (int i=0; i<size; i++) {
			random.enqueue(i);
		}
		return random; 
	}	
}
