package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtils {

    public static int getInteger() {
        Scanner scanner = new Scanner(System.in);
        int integer;
        while (true) {
            try {
                integer = scanner.nextInt();
                return integer;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Type integer value!");
            }
        }
    }

}