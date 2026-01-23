import java.util.Scanner;

public class ReadingUserData {
    public static void main(String[] args){
        int currentYear = 2026;
        System.out.println("Your current age is " + getInputFromScanner(currentYear));

    }
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, what is your name: ");
        String year = System.console().readLine("In what year were you born: ");

        int age = currentYear - Integer.parseInt(year);
        return "So you are "+ age + " years old!";
    }

    public static String getInputFromScanner(int currentYear){
        Scanner scan = new Scanner(System.in);
        System.out.println("In what year were you borth: ");
        String year = scan.nextLine();
        int age = currentYear - Integer.parseInt(year);
        return "So you are "+ age + " years old!";
    }
}