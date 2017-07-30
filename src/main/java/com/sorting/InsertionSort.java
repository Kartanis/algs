package com.sorting;

import java.util.Comparator;

public class InsertionSort extends Sorting {

    @Override
    public <T extends Comparable> T[] sort(T[] data) {
        for (int indexOfCurrentElement = 1; indexOfCurrentElement < data.length; indexOfCurrentElement++) {
            for (int indexOfComparingElement = 0;
                 indexOfComparingElement < indexOfCurrentElement;
                 indexOfComparingElement++
                    ) {
                if (data[indexOfCurrentElement].compareTo(data[indexOfComparingElement]) < 0) {
                    moveArray(data, indexOfCurrentElement, indexOfComparingElement);
                }
            }
        }

        return data;
    }

    private <T extends Comparable> void moveArray(T[] data, int indexOfCurrentElement, int indexOfComparingElement) {
        int movinIndex = indexOfCurrentElement;
        while (indexOfComparingElement < movinIndex) {
            swap(data, movinIndex, movinIndex - 1);
            movinIndex--;
        }
    }

    private <T extends Comparable> void swap(T[] data, int indexOfCurrentElement, int indexOfPreviousElement) {
        T tmp = data[indexOfCurrentElement];
        data[indexOfCurrentElement] = data[indexOfPreviousElement];
        data[indexOfPreviousElement] = tmp;
    }

    @Override
    public <T> T sort(T[] data, Comparator<T> comparator) {
        return null;
    }
}
