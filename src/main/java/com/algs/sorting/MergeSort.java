package com.algs.sorting;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSort extends Sorting {
    @Override
    public <T extends Comparable> T[] sort(T[] data) {
        return (T[]) mergeSort(Arrays.stream(data).collect(Collectors.toList())).toArray(data);
    }

    private <T extends Comparable> LinkedList<T> mergeSort(List<T> data) {
        if (data.size() == 1) {
            LinkedList<T> list = new LinkedList<T>();
            list.add(data.get(0));
            return list;
        }
        LinkedList<T> left = new LinkedList();
        left.addAll(data.stream().limit(data.size() / 2).collect(Collectors.toList()));

        LinkedList<T> right = new LinkedList();
        right.addAll(data.stream().skip(data.size() / 2).limit(data.size() / 2 + 1).collect(Collectors.toList()));

        return merge(mergeSort(left), mergeSort(right));
    }

    private <T extends Comparable> LinkedList<T> merge(LinkedList<T> left, LinkedList<T> right) {
        LinkedList<T> result = new LinkedList<>();
        while (!left.isEmpty() || !right.isEmpty()) {
            if (right.isEmpty() || !left.isEmpty() && left.getFirst().compareTo(right.getFirst()) <= 0) {
                result.add(left.getFirst());
                left.removeFirst();
            } else {
                result.add(right.getFirst());
                right.removeFirst();
            }
        }

        return result;
    }

}
