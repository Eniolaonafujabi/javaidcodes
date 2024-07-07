package tdd;

import java.util.Scanner;

public class CheckStateApplication {
    public static void main(String[] args) {
        goToMainMenu();
        }

    private static void goToMainMenu() {
        String message = """
                WELCOME TO CHECK STATE APPLICATION
                1: To Check Geo Political Zone
                2: To Back
                3: EXIT
                """;
        String inputCollected = input(message);
        switch (inputCollected){
            case "1": checkPoliticalZoneByState();
            case "2": goToMainMenu();
            case "3": System.exit(0);
    }
}

    private static void checkPoliticalZoneByState() {
        String inputCollected = input("Enter the state: ");
        State user = new State();
        output(user.checkZone(inputCollected));
        goToMainMenu();
    }

    private static void  output(GeoPoliticalZone message) {
        System.out.println(message);
    }

    private static String input(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.next();
    }
}
