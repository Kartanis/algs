package com.algs.sorting;

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

    /**
     * Move current element to the left until it reach comparing element index
     *
     * @param data
     * @param sourceIndex
     * @param destinationIndex
     * @param <T>
     */
    private <T extends Comparable> void moveArray(T[] data, int sourceIndex, int destinationIndex) {
        for (int index = sourceIndex; index > destinationIndex; index--) {
            swap(data, index, index - 1);
        }
    }

    private <T extends Comparable> void swap(T[] data, int indexOfCurrentElement, int indexOfPreviousElement) {
        T tmp = data[indexOfCurrentElement];
        data[indexOfCurrentElement] = data[indexOfPreviousElement];
        data[indexOfPreviousElement] = tmp;
    }

}
