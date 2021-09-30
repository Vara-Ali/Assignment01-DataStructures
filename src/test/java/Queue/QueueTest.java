package Queue;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class QueueTest {

	private Queue q1;
	private Dequeue d1;
	private CircularQueueUsingArray c1;
	private QueueUsingArray qa1;
	private QueueUsingArray qa2;
	
	@Before
	public void setUp() throws Exception
	{
		q1 = new Queue();
		q1.enqueue(9);
		q1.enqueue(5);
		q1.enqueue(2);
		q1.enqueue(7);
		
		d1= new Dequeue(8); 
		d1.addRight(6);
		d1.addLeft(8);
		d1.addRight(1);
		d1.addLeft(5);
		d1.addRight(2);
		d1.addLeft(7);
		
		c1=new CircularQueueUsingArray(8);
		c1.enqueue(7);
		c1.enqueue(5);
		c1.enqueue(3);
		c1.enqueue(9);
		c1.enqueue(7);
		c1.enqueue(5);
		c1.enqueue(3);
		c1.enqueue(9);
		c1.enqueue(0);
		c1.enqueue(5);
		c1.enqueue(3);
		c1.dequeue();
		
		qa1 = new QueueUsingArray(8);
		qa1.enqueue(9);
		qa1.enqueue(6);
		
		qa2 = new QueueUsingArray(8);
		qa2.enqueue(9);
		qa2.enqueue(6);
		qa2.enqueue(7);
		qa2.dequeue();	
	}
	
	
	
	//Dequeue test--->Queue.java
	@Test 
	public void testdequeue() 
	{	
		int expected = q1.dequeue();
		int result = 9;
		assertEquals(expected,result);
		//fail("Not yet implemented");
	}
	
	
	
	//Display test--->Dequeue.java
	@Test 
	public void testdisplay() 
	{	
		int [] expected = d1.array;
		d1.display();
		assertArrayEquals(new int[]  {8,5,7,0,0,2,1,6},expected );
		//fail("Not yet implemented");
	}
		
		
	//Display test--->CircularQueueUsingArray.java
	@Test 
	public void testdisplayCQ() 
	{	
		int [] expected = c1.array;
		assertArrayEquals(new int[]  {7,5,3,9,7,5,3,9,0},expected);
	}
	
	
	
	//dequeue test--->CircularQueueUsingArray.java
	@Test 
	public void testdequeueCQ() 
	{	
		c1.dequeue();
		int [] expected = c1.array;
		c1.display();
		assertArrayEquals(new int[]  {7,5,3,9,7,5,3,9,0},expected);
	}
		
		
	
	//display test--->QueueUsingArray.java
	@Test 
	public void testdisplayQA() throws Exception 
	{	
		int[] expected = qa1.array; 
		qa1.display();
		assertArrayEquals(new int[]  {9,6,0,0,0,0,0,0,0}, expected);
		
	}
	
	
	
	//dequeue test--->QueueUsingArray.java
	@Test 
	public void testdequeuQA() throws Exception 
	{	
			
		int[] expected = qa2.array; 
		assertArrayEquals(new int[]  {9,6,7,0,0,0,0,0,0}, expected);
	}
	
	
	//size test--->QueueUsingArray.java
	@Test 
	public void testSize() 
	{	
		int expected = qa1.size();
		int result = 2;
		assertEquals(expected,result);
	}
	
	//size test--->QueueUsingArray.java
	@Test 
	public void testifEmpty() 
	{	
		assertFalse(qa1.empty());
	}
	
	
		
		
		
	@After
	public void tearDown() throws Exception 
	{	
		//Queue.java
		qa1.display();
		q1.display();
	}

}
