package menu;

import lists.ArrayListUtils;
import lists.BinarySearch;
import lists.QuickSort;
import utils.ScannerUtils;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    public static void menuStart() {
        final int CREATE_OPTION = 1;
        final int CREATE_RANDOM_OPTION = 2;
        final int EXTEND_OPTION = 3;
        final int EXTEND_RANDOM_OPTION = 4;
        final int PRINT_OPTION = 5;
        final int SEARCH_OPTION = 6;
        final int EXIT_OPTION = 0;

        List<Integer> list = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            mainMenuInformation();
            int decision = ScannerUtils.getInteger();
            switch (decision) {
                case CREATE_OPTION:
                    list = ArrayListUtils.listCreator(list);
                    break;
                case CREATE_RANDOM_OPTION:
                    list = ArrayListUtils.listRandomCreator(list);
                    break;
                case EXTEND_OPTION:
                    list = ArrayListUtils.listExtender(list);
                    break;
                case EXTEND_RANDOM_OPTION:
                    list = ArrayListUtils.listRandomExtender(list);
                    break;
                case PRINT_OPTION:
                    ArrayListUtils.printList(list);
                    break;
                case SEARCH_OPTION:
                    searchOption(list);
                    break;
                case EXIT_OPTION:
                    exit = true;
                    break;
                default:
                    errorMessage();
                    break;
            }
        }
    }

    private static void searchOption(List<Integer> list) {
        QuickSort.sort(list, 0, list.size() - 1);
        System.out.println("Searched value:");
        int result = BinarySearch.search(list, ScannerUtils.getInteger());
        if (result == BinarySearch.RESULT_NOT_FOUND) {
            System.out.println("Value not found.");
        } else {
            System.out.println("Value found at index: " + result);
        }
    }

    private static void errorMessage() {
        System.out.println("Wrong command!");
    }

    private static void mainMenuInformation() {
        System.out.println("1: Create list of integers");
        System.out.println("2: Create list of integers using random values");
        System.out.println("3: Extend list of integers");
        System.out.println("4: Extend list of integers using random values");
        System.out.println("5: Print list of integers");
        System.out.println("6: Search list of integers");
        System.out.println("0: Exit");
    }

}
