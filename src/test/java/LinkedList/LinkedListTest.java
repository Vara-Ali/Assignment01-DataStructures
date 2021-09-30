package LinkedList;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest 
{
	private LinkedList list;
	private LinkedListImp l1;
	private LinkedListSwapNodes ls1;
	
	
	//https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}
	
	
	@Before
	public void setUp() throws Exception
	{
		l1 = new LinkedListImp();
		ls1 = new LinkedListSwapNodes();
		//l1.pushBack(7);
	}

	
	//add -->>> LinkedListImp.java
	@Test
	public void testadd() 
	{
		setUpStreams();
		l1.add(8);
		assertEquals("Adding element at the back of the list : 8" , outContent.toString().trim().replace("\r",""));
	}
	
	
	//add -->>> LinkedListImp.java
	@Test
	public void testaddF() 
	{
		setUpStreams();
		l1.add(2);
		assertNotEquals("Adding element at the back of the list : 8" , outContent.toString().trim().replace("\r",""));
	}
	
	
	//pushFront -->>> LinkedListImp.java
	@Test
	public void testpushFront() 
	{
		setUpStreams();
		l1.pushFront(7);
		assertEquals("Inserting element at the front of the list : 7" , outContent.toString().trim().replace("\r",""));
	}
	
	
	
	//topFront -->>> LinkedListImp.java
	@Test
	public void testpopFront() throws Exception 
	{
		setUpStreams();
		l1.popFront();
		assertEquals("PopFront Operation." , outContent.toString().trim().replace("\r",""));
	}
	
	
	//pushBack -->>> LinkedListImp.java
	@Test
	public void testpushBack() 
	{
		setUpStreams();
		l1.pushBack(9);
		assertEquals("Inserting element at the back of the list : 9" , outContent.toString().trim().replace("\r",""));
	}
	
	
	//pushBack -->>> LinkedListImp.java
	@Test
	public void testpushBackF() 
	{
		setUpStreams();
		l1.pushBack(10);
		assertNotEquals("Inserting element at the back of the list : 9" , outContent.toString().trim().replace("\r",""));
	}
	
	
	//topBack -->>> LinkedListImp.java
	@Test
	public void testtopBack() throws Exception 
	{
		int expected = l1.topBack();
		int result = 2;
		assertEquals(expected,result);	
	}
	

	//topFront -->>> LinkedListImp.java
	@Test
	public void testtopFront() throws Exception 
	{
		int expected = l1.topFront();
		int result = 7;
		assertEquals(expected,result);	
	}
	
	
	
	//size -->>> LinkedListImp.java
	@Test
	public void testsize()
	{
		int expected = l1.size();
		int result = 5;
		assertEquals(expected,result);	
	}
	
	
	//size -->>> LinkedListImp.java
	@Test
	public void testsizeF()
	{
		int expected = l1.size();
		int result = 2;
		assertNotEquals(expected,result);	
	}
	
	
	//display -->>> LinkedListImp.java
	@Test
	public void testdisplay() 
	{
		setUpStreams();
		l1.display();
		assertNotEquals("LinkedList : " , outContent.toString().trim().replace("\r",""));
	}
	
	
	
	////////////---------------->>>>>>>>>>>>>>>>>>.LinkedListSwapNodes.java <<<<<<<<<<<<<<<<<<--------------------------------//////
	
	//pushFront -->>> LinkedListSwapNodes.java
	@Test
	public void testpushFrontSL() 
	{
		setUpStreams();
		ls1.pushFront(7);
		assertEquals("Inserting data at front : 7" , outContent.toString().trim().replace("\r",""));
	}
	
	
	//pushBack -->>> LinkedListSwapNodes.java
	@Test
	public void testpushBackSL() 
	{
		setUpStreams();
		ls1.pushBack(10);
		assertEquals("Inserting data at back  : 10" , outContent.toString().trim().replace("\r",""));
	}
	
	
	//pushBack -->>> LinkedListSwapNodes.java
	@Test
	public void testswapSL() 
	{
		setUpStreams();
		ls1.swap();
		assertEquals("Swapping data values of first and last node." , outContent.toString().trim().replace("\r",""));
	}
	
	
	//	//display -->>> LinkedListSwapNodes.java
	@Test
	public void testdisplaySL() 
	{
		setUpStreams();
		ls1.display();
		
	}
	
////////////---------------->>>>>>>>>>>>>>>>>>.LinkedList.java <<<<<<<<<<<<<<<<<<--------------------------------//////
	
	
	


}
