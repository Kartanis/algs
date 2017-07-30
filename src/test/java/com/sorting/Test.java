package com.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;

public class Test {

    private static final Integer[] INPUT_DATA = {5, 2, 4, 6, 1, 3};
    private static final Integer[] EXPECTED_RESULT = {1, 2, 3, 4, 5, 6};

    @Before
    public void setup() {
    }

    @org.junit.Test
    public void test() {
        Sorting sort = SortingEngine.get(SortingEngine.ISERTION_SORT);
        assertArrayEquals(EXPECTED_RESULT, sort.sort(INPUT_DATA));
    }

}
