package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


/**
 * Created by pebuls on 14.03.17.
 */
public class BinarySearchTest {

    int element = 1000;
    int seq[];
    SearchResult searchResult;

    @Test
    public void elementInSequency() throws Exception {

        seq = new int[] {element};
        searchResult = BinarySearch.search(element, seq);
        assertThat(searchResult.isFound(), is(true));
    }

    @Test
    public void elementIsNotInSequency() throws Exception {

        seq = new int[] {element - 1};
        searchResult = BinarySearch.search(element, seq);
        assertThat(searchResult.isFound(), is(false));
    }

    @Test
    public void elementIsFirstInSequency() throws Exception {

        seq = new int[] {element, element + 4556, element + 3};
        searchResult = BinarySearch.search(element, seq);
        assertThat(searchResult.isFound(), is(true));
        assertThat(searchResult.getPosition(), is(0) );
    }







}