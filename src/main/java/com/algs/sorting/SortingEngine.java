package com.algs.sorting;

public class SortingEngine {
    public static final int ISERTION_SORT = 1;

    public static Sorting get(int isertionSort) {
        return new InsertionSort();
    }
}
