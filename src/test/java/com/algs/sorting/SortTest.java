package com.algs.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SortTest {

    private static final Integer[] INPUT_DATA = {5, 2, 4, 6, 1, 3};
    private static final Integer[] EXPECTED_RESULT = {1, 2, 3, 4, 5, 6};
    private Sorting sort;

    @Test
    public void insertionSort() {
        setUp(SortingEngine.INSERTION_SORT);
        assertArrayEquals(EXPECTED_RESULT, sort.sort(INPUT_DATA.clone()));
    }

    private void setUp(int sortType) {
        sort = SortingEngine.get(sortType);
    }

    @Test
    public void mergeSort() throws Exception {
        setUp(SortingEngine.MERGE_SORT);
        assertArrayEquals(EXPECTED_RESULT, sort.sort(INPUT_DATA.clone()));
    }
}
