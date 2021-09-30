package Arrays;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;

import org.junit.Test;

public class DSTest 
{

	//private SavingsAccount ZakatunderTest;
	private Array Arr;
	private ArrayDeletion ArrDel;
	private ArrayInsertion ArrIns;
	//private int //arr1s[];
	

	@Before
	public void setUp() 
	{
		//ZakatunderTest = new SavingsAccount();
		Arr = new Array();	
		ArrDel = new ArrayDeletion();
		Arr.insert(8, 0);
		Arr.insert(2, 1);
		Arr.insert(7, 2);
		Arr.insert(9, 3);
		Arr.insert(2, 4);
		Arr.insert(5, 5);
		Arr.insert(0, 6);
		
		//Arr.getValues();
		Arr.display();
		//arr1s = Array.array;
		
		//Arr.getValues();
		Arr.display();
		
		ArrIns = new ArrayInsertion();
	}
	
	@Test
	//Array Deletion ---> ArrayDeletion.java
	public void testdelete() 
	{	
		assertArrayEquals(new int[] {1,6,34,2,43,-1},ArrayDeletion.delete(new int[] {1,6,34,0,2,43},3));
	}
	
	@Test
	//Array Insertion ---------> ArrayInsertion.java
	public void testinsert() 
	{	
		assertArrayEquals(new int[] {0,1,34,0,2,43},ArrayInsertion.insert(new int[] {1,6,34,0,2,43}, 0, 0));
	}
	
	/*@Test
	//Array insert
	public void testinsert2() 
	{
		int arrResult [] = {0,1,2};
		assertEquals(arrResult,Arr.array);
		
		//assertArrayEquals(new int[] {0,1,2},Array.array);
	
	}
	*/
	@Test
	//Array linear Search -----> Array.java
	public void testlinearSearch() 
	{	
		boolean arrT = Arr.linearSearch(0);
		assertTrue(arrT);
	}
	
	@Test
	//Array linear Search -----> Array.java
	public void testlinearSearchF() 
	{	
		boolean arrT = Arr.linearSearch(15);
		assertFalse(arrT);
	}
	
	@Test
	//Array binary Search -----> Array.java
	public void testbinarySearch() 
	{	
		boolean arrT = Arr.binarySearch(2, 0, 9);
		assertTrue(arrT);
	}
	
	@Test
	//Array binary Search -----> Array.java
	public void testbinarySearchF() 
	{	
		boolean arrF = Arr.binarySearch(12, 0, 9);
		assertFalse(arrF);
	}
	
	/*@Test
	//Array Insertion
	public void testbubbleSort() 
	{	
		Arr.delete(0);
		//Arr.getValues();
		Arr.bubbleSort();
		int arrResult [] = {0,1,2};
		int arrExpected [] = Arr.array;
		assertArrayEquals(arrResult,arrExpected);
	}*/
	
	//
	@After
	public void afterTest()
	{
		///-----> Array.java
		Arr.delete(0);
		Arr.bubbleSort();
		Arr.display();
		
		
		///-----> ArrayDeletion.java
		ArrDel.display(new int[] {1,6,34,2,43,-1});
		
		//Arr.getValues();
		Arr.display();
		
	}
	
	

}
