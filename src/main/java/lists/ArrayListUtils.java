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
        for (int i = 0; i < size; i++) {
            list.add(ScannerUtils.getInteger());
        }
        return list;
    }

    public static List<Integer> listRandomCreator(List<Integer> list) {
        list.clear();
        System.out.println("List size:");
        int size = ScannerUtils.getInteger();
        System.out.println("Minimal value:");
        int min = ScannerUtils.getInteger();
        System.out.println("Maximal value:");
        int max = ScannerUtils.getInteger();
        Random generator = new Random();
        for (int i = 0; i < size; i++) {
            list.add(generator.nextInt((max - min) + 1) + min);
        }
        return list;
    }

    public static List<Integer> listExtender(List<Integer> list) {
        System.out.println("Number of values you want to add:");
        int numberOfValues = ScannerUtils.getInteger();
        System.out.println("Values:");
        for (int i = 0; i < numberOfValues; i++) {
            list.add(ScannerUtils.getInteger());
        }
        return list;
    }

    public static List<Integer> listRandomExtender(List<Integer> list) {
        System.out.println("Number of random values you want to add:");
        int numberOfValues = ScannerUtils.getInteger();
        System.out.println("Minimal value:");
        int min = ScannerUtils.getInteger();
        System.out.println("Maximal value:");
        int max = ScannerUtils.getInteger();
        Random generator = new Random();
        for (int i = 0; i < numberOfValues; i++) {
            list.add(generator.nextInt((max - min) + 1) + min);
        }
        return list;
    }

}
