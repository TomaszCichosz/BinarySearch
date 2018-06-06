package menu;

class MenuUtils {

    static void errorMessage() {
        System.out.println("Wrong command!");
    }

    static void mainMenuInformation() {
        System.out.println("1: Create list of integers");
        System.out.println("2: Create list of integers using random values");
        System.out.println("3: Extend list of integers");
        System.out.println("4: Extend list of integers using random values");
        System.out.println("5: Print list of integers");
        System.out.println("6: Search list of integers");
        System.out.println("0: Exit");
    }
}
