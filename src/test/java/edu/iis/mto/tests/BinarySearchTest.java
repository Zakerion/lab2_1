package edu.iis.mto.tests;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * User: Klaudia
 */
public class BinarySearchTest {


    @Test(expected = IllegalArgumentException.class)
    public void notContainsAnyElement() {
        int key = 2;
        BinarySearch.search(key, new int[]{});
    }

    @Test
    public void containsElementInSeq() {
        int key = 2;
        int seq[] = new int[]{1, 2, 3, 4, 5, 6};
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), is(true));
    }

    @Test
    public void containsElementInSeqPosition() {
        int key = 2;
        int position = 1;
        int seq[] = new int[]{1, key, 3, 4, 5, 6};
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.getPosition(), is(position));
    }

    @Test
    public void keyNotIncludedInSequence() {
        int key = 7;
        int seq[] = new int[]{1, 2, 3, 4, 5, 6};
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), is(false));
    }

    @Test
    public void keyNotIncludedInSequencePosition() {
        int key = 7;
        int position = -1;
        int seq[] = new int[]{1, 2, 3, 4, 5, 6};
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.getPosition(), is(position));
    }

    @Test
    public void isContentInSeqLenOnePosition() {
        int key = 7;
        int seq[] = new int[]{key};
        int position = seq.length - 1;
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.getPosition(), is(position));
    }

    @Test
    public void isContentInSeqLenOneFound() {
        int key = 7;
        int seq[] = new int[]{key};
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), is(true));

    }


    @Test
    public void notContentInSeqLenOnePosition() {
        int key = 7;
        int element = 1;
        int seq[] = new int[]{element};
        int pos = -1;
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.getPosition(), is(pos));
    }

    @Test
    public void notContentInSeqLenOneFound() {
        int key = 7;
        int element = 1;
        int seq[] = new int[]{element};
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), is(false));
    }

    @Test
    public void elementIsFirstInSeqPosition() {
        int key = 1;
        int seq[] = new int[]{key, 2, 3, 4, 5, 6};
        int pos = 0;
        SearchResult result = BinarySearch.search(key, seq);
        assertThat(result.getPosition(), is(pos));
    }

    @Test
    public void elementIsFirstInSeqFound() {
        int key = 1;
        int seq[] = new int[]{key, 2, 3, 4, 5, 6};
        SearchResult result = BinarySearch.search(key, seq);
        assertThat(result.isFound(), is(true));
    }

    @Test
    public void elementIsLastInSeqPosition() {
        int key = 6;
        int seq[] = new int[]{1, 2, 3, 4, 5, key};
        int pos = seq.length - 1;
        SearchResult result = BinarySearch.search(key, seq);
        assertThat(result.getPosition(), is(pos));
    }

    @Test
    public void elementIsLastInSeqFound() {
        int key = 6;
        int seq[] = new int[]{1, 2, 3, 4, 5, key};
        SearchResult result = BinarySearch.search(key, seq);
        assertThat(result.isFound(), is(true));
    }

    @Test
    public void elementIsMiddleInArray() {
        int key = 3;
        int[] seq = {1, key, 5};
        int expectedPosition = 1;
        SearchResult result = BinarySearch.search(key, seq);
        assertThat(result.getPosition(), is(expectedPosition));
    }

    @Test
    public void notContainsKeyInSeqPosition() {
        int key = 3;
        int[] seq = {1, 2, 5};
        int expectedPosition = -1;
        SearchResult result = BinarySearch.search(key, seq);
        assertThat(result.getPosition(), is(expectedPosition));
    }

    @Test
    public void notContainsKeyInSeqFound() {
        int key = 3;
        int[] ARRAY = {1, 2, 5};
        SearchResult result = BinarySearch.search(key, ARRAY);
        assertThat(result.isFound(), is(false));
    }
}