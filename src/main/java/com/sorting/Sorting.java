package com.sorting;

import java.util.Comparator;

public abstract class Sorting {

    public abstract <T extends Comparable> T[] sort(T[] data);
    public abstract <T> T sort(T[] data, Comparator<T> comparator);

}
