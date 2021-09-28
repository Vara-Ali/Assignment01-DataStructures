package Arrays;

import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class DSTest 
{

	//private SavingsAccount ZakatunderTest;
	private Array Arr;
	//private int //arr1s[];
	

	@Before
	public void setUp() 
	{
		//ZakatunderTest = new SavingsAccount();
		Arr = new Array();	
		Array.insert(0, 0);
		Array.insert(1, 1);
		Array.insert(2, 2);
		Array.display();
		//arr1s = Array.array;
	}
	
	@Test
	//Array Deletion
	public void testdelete() 
	{	
		assertArrayEquals(new int[] {1,6,34,2,43,-1},ArrayDeletion.delete(new int[] {1,6,34,0,2,43},3));
	}
	
	@Test
	//Array Insertion
	public void testinsert() 
	{	
		assertArrayEquals(new int[] {0,1,34,0,2,43},ArrayInsertion.insert(new int[] {1,6,34,0,2,43}, 0, 0));
	}
	
	/*@Test
	//Array insert
	public void testinsert2() 
	{
		int arrResult [] = {0,1,2};
		assertEquals(arrResult,Array.array);
		
		//assertArrayEquals(new int[] {0,1,2},Array.array);
	
	}*/
	
	@Test
	//Array linear Search
	public void testlinearSearch() 
	{	
		//assertArrayEquals(new int[] {0,1,34,0,2,43},ArrayInsertion.insert(new int[] {1,6,34,0,2,43}, 0, 0));
		boolean arrT = Array.linearSearch(0);
		assertTrue(arrT);
	}
	
	@Test
	//Array binary Search
	public void testbinarySearch() 
	{	
		//assertArrayEquals(new int[] {0,1,34,0,2,43},ArrayInsertion.insert(new int[] {1,6,34,0,2,43}, 0, 0));
		boolean arrT = Array.binarySearch(2, 0, 2);
		assertTrue(arrT);
	}
	
	@Test
	//Array Insertion
	public void testbubbleSort() 
	{	
		Arr.bubbleSort();
		int arrResult [] = {0,1,2};
		int arrExpected [] = Arr.array;
		assertArrayEquals(arrResult,arrExpected);
	}
	
	

}
