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

	@Test
	public void isFirstElementInSeq() {
		int[] seq = new int[] { 1, 2, 3, 4, 5 };
		SearchResult result = BinarySearch.search(1, seq);
		assertThat(result.getPosition(), Matchers.equalTo(1));
	}

	@Test
	public void isLastElementInSeq() {
		int[] seq = new int[] { 1, 2, 3, 4, 5 };
		SearchResult result = BinarySearch.search(5, seq);
		assertThat(result.getPosition(), Matchers.equalTo(seq.length));
	}

}
