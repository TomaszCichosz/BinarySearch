package lists;

import java.util.List;

public class QuickSort {

    public static void sort(List<Integer> list, int startingLeftIndex, int startingRightIndex) { //zaczynamy z list,0,list.size()-1
        int leftIndex = startingLeftIndex;
        int rightIndex = startingRightIndex;
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
        if (startingLeftIndex < rightIndex)
            sort(list, startingLeftIndex, rightIndex);
        if (leftIndex < startingRightIndex)
            sort(list, leftIndex, startingRightIndex);
    }

    private static void swap(List<Integer> list, int leftIndex, int rightIndex) {
        int temp = list.get(rightIndex);
        list.remove(rightIndex);
        list.add(rightIndex, list.get(leftIndex));
        list.remove(leftIndex);
        list.add(leftIndex, temp);
    }

}
