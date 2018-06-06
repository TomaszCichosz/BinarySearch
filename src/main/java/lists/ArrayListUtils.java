package lists;

import utils.ScannerUtils;

import java.util.List;
import java.util.Random;

public class ArrayListUtils {

    public static void printList(List<Integer> list) {
        System.out.print("[ ");
        for (Integer temp : list) {
            System.out.print(temp + " ");
        }
        System.out.println("]");
    }

    public static List<Integer> listCreator(List<Integer> list) {
        list.clear();
        System.out.println("List size:");
        int size = ScannerUtils.getInteger();
        System.out.println("Values:");
        extendList(list, size);
        return list;
    }

    public static List<Integer> listExtender(List<Integer> list) {
        System.out.println("Number of values you want to add:");
        int numberOfValues = ScannerUtils.getInteger();
        System.out.println("Values:");
        extendList(list, numberOfValues);
        return list;
    }

    private static void extendList(List<Integer> list, int elementCount) {
        for (int i = 0; i < elementCount; i++) {
            list.add(ScannerUtils.getInteger());
        }
    }

    public static List<Integer> listRandomCreator(List<Integer> list) {
        list.clear();
        System.out.println("List size:");
        int size = ScannerUtils.getInteger();
        randomExtendList(list, size);
        return list;
    }

    public static List<Integer> listRandomExtender(List<Integer> list) {
        System.out.println("Number of random values you want to add:");
        int numberOfValues = ScannerUtils.getInteger();
        randomExtendList(list, numberOfValues);
        return list;
    }

    private static void randomExtendList(List<Integer> list, int elementCount) {
        System.out.println("Minimal value:");
        int min = ScannerUtils.getInteger();
        System.out.println("Maximal value:");
        int max = ScannerUtils.getInteger();
        Random generator = new Random();
        for (int i = 0; i < elementCount; i++) {
            list.add(generator.nextInt((max - min) + 1) + min);
        }
    }

}
