package edu.iis.mto.bsearch;

import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void isInSeq() {
		int[] seq = new int[] { 5 };
		SearchResult result = BinarySearch.search(5, seq);
		assertThat(result.isFound(), Matchers.equalTo(true));
	}

	@Test
	public void isNotInSeq() {
		int[] seq = new int[] { 3 };
		SearchResult result = BinarySearch.search(5, seq);
		assertThat(result.isFound(), Matchers.equalTo(false));
	}
}
