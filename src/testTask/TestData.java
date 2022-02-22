package testTask;

import java.util.Scanner;

public class TestData {

    private final Scanner scanner = new Scanner(System.in);


    public int testInt() {
        System.out.println(Utils.getString("Please enter the number of string"));
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            scanner.nextLine();
            return a;
        }
        return testInt();
    }

    public String testString() {
        System.out.println(Utils.getString("Please enter the strings"));
        return scanner.nextLine();
    }
}
