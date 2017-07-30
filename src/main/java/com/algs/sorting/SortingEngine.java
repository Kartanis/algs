package com.algs.sorting;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class SortingEngine {
    public static final int INSERTION_SORT = 1;
    public static final int MERGE_SORT = 2;

    private static Map<Integer, Sorting> engines = ImmutableMap
            .of(INSERTION_SORT, new InsertionSort(),
                    MERGE_SORT, new MergeSort());

    public static Sorting get(int sortType) {

        return engines.get(sortType);
    }
}
