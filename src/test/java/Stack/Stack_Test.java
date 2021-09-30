package Stack;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Stack_Test {

	private MyStack s1;
	private Stack stack; 
	private StackwithLinkedList sl;
	
	@Before
	public void setUp() throws Exception
	{
		s1 = new MyStack(8);
		s1.push(5);
		s1.push(6);
		s1.push(2);
		
		stack = new Stack();
		stack.push(4);
		stack.push(2);
		stack.push(7);
		stack.push(8);
		
		sl = new StackwithLinkedList();
		sl.push(4);
		sl.push(8);
		sl.push(2);
		sl.push(9);
		
	}
	
	//////////////////////////////////MyStack.java
	//top
	@Test
	public void testtop() throws Exception 
	{
		int result =2;
		int expected = s1.top();
		assertEquals(result,expected);
	}
	
	
	//pop
	@Test
	public void testpop() throws Exception 
	{
		int result =2;
		int expected = s1.pop();
		assertEquals(result,expected);
	}

	//pop
	@Test
	public void testsize() 
	{
		int result =3;
		int expected = s1.size();
		assertEquals(result,expected);
	}
		
		
	//displayStack
	@Test
	public void testdisplayStack()
	{
		int [] result = {5,6,2,0,0,0,0,0};
		s1.displayStack();
		int [] expected = s1.arraytostoreStack;
		assertArrayEquals(result,expected);
	}
	
	
	
	//////////////////////////////////Stack.java
	//pop
	@Test
	public void testpopS() 
	{
		int result =8;
		int expected = stack.pop();
		System.out.println(expected);
		assertEquals(result,expected);
	}
	
	
	//display
	@Test
	public void testdisplayS() 
	{
		stack.display();
		int [] result = {4,2,7,8,0,0,0,0,0};
		int [] expected = stack.array;
		assertArrayEquals(result,expected);
	}
	
	
//////////////////////////////////StackwithLinkedList.java
	
	//top--StackwithLinkedList.java
	@Test
	public void testtopSL() 
	{
		int result =9;
		int expected = sl.pop();
		assertEquals(result,expected);
	}
	
	
	//pop---StackwithLinkedList.java
	@Test
	public void testpopSL()  
	{
		int result =9;
		int expected = sl.top();
		assertEquals(result,expected);
	}
	
	
	//display----StackwithLinkedList.java
	@Test
	public void testdisplaySL() 
	{
		sl.display();
		//int [] result = {4,2,7,8,0,0,0,0,0};
		//int [] expected = sl.
		//assertArrayEquals(result,expected);
	}
	
	
	
	
	
	
	
	

}
