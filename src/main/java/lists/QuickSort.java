package lists;

import java.util.List;

public class QuickSort {


    public static void sort(List<Integer> list, int startIndex, int endIndex) {
        int leftIndex = startIndex;
        int rightIndex = endIndex;
        int separator = list.get((rightIndex + leftIndex) / 2);
        do {
            while (list.get(leftIndex) < separator)
                leftIndex++;
            while (separator < list.get(rightIndex))
                rightIndex--;
            if (leftIndex <= rightIndex) {
                swap(list, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        } while (leftIndex <= rightIndex);
        if (startIndex < rightIndex)
            sort(list, startIndex, rightIndex);
        if (leftIndex < endIndex)
            sort(list, leftIndex, endIndex);
    }

    private static void swap(List<Integer> list, int leftIndex, int rightIndex) {
        int temp = list.get(rightIndex);
        list.set(rightIndex, list.get(leftIndex));
        list.set(leftIndex, temp);
    }

}
