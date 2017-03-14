package lab2_1;

import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;

public class Tests {
	
	@Test
	public void seq1present() {
		int[] tab = new int[1];
		tab[0] = 1;
		assertTrue(BinarySearch.search(1, tab).isFound());
	}
	
	@Test
	public void seq1absent() {
		int[] tab = new int[1];
		tab[0] = 0;
		assertFalse(BinarySearch.search(1, tab).isFound());
	}
	
	@Test
	public void seqMore1first() {
		int[] tab = new int[5];
		for(int a = 0; a < 5; a++) {
			tab[a] = a;
		}
		assertTrue(BinarySearch.search(0, tab).getPosition() == 0);
	}
	
	@Test
	public void seqMore1last() {
		int[] tab = new int[7];
		for(int a = 0; a < 7; a++) {
			tab[a] = a;
		}
		assertTrue(BinarySearch.search(6, tab).getPosition() == tab.length - 1);
	}
}