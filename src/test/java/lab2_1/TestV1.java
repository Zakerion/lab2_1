package lab2_1;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;

public class TestV1 {

	@Test
	public void seq1Present() {
		int [] array = new int[1];
		array[0] = 3;
		
		assertTrue(BinarySearch.search(3, array).isFound());
	}
	
	@Test
	public void seq1NotPresent() {
		int [] array = new int[1];
		array[0] = 3;
		
		assertFalse(BinarySearch.search(4, array).isFound());
	}
	
	@Test
	public void multipleSeqIsFirst() {
		int [] array = new int[10];
		for(int i = 0; i < 10; i++) {
			array[i] = i;
		}
		assertTrue(BinarySearch.search(0, array).getPosition() == 1);
	}
	
	@Test
	public void multipleSeqIsLast() {
		int [] array = new int[10];
		for(int i = 0; i < 10; i++) {
			array[i] = i;
		}
		assertTrue(BinarySearch.search(9, array).getPosition() == array.length);
	}
	
	@Test
	public void multipleSeqIsMiddle() {
		int [] array = new int[9];
		for(int i = 0; i < 9; i++) {
			array[i] = i;
		}

		assertTrue(BinarySearch.search(4, array).getPosition() == (array.length/2+1));
	}

}
