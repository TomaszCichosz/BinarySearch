package lists;

import java.util.List;

public class BinarySearch {

    public static final int RESULT_NOT_FOUND = -1;

    public static int search(List<Integer> list, int searchedValue) {
        int listSize = list.size();
        int leftIndex = 0;
        int rightIndex = listSize - 1;
        int separatorIndex;
        while (true) {
            printList(list, leftIndex, rightIndex);
            if (leftIndex > rightIndex) {
                return RESULT_NOT_FOUND;
            } else {
                separatorIndex = (leftIndex + rightIndex) / 2;
                if (list.get(separatorIndex) == searchedValue) {
                    return separatorIndex;
                } else if (list.get(separatorIndex) < searchedValue) {
                    leftIndex = ++separatorIndex;
                } else {
                    rightIndex = --separatorIndex;
                }
            }
        }
    }

    private static void printList(List<Integer> list, int startIndex, int endIndex) {
        System.out.print("[ ");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("]");
    }

}
