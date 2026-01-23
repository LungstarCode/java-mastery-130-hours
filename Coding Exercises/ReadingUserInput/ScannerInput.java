import java.util.Scanner;
class Scanner {

    public static void getUserAge(int currentYear, String name){
        // creating a scanner object using the System.in arg to receive user input
        Scanner fetch = new Scanner(System.in);
        int currentYear = 2026;

        System.out.println("What is your name: ");
        String name = fetch.nextLine();

        System.out.println("In what year were you born: ");
        String yearOfBirth = fetch.nextLine();
        int year = Integer.parseInt(yearOfBirth);

        
    }
}