// answering the user input challenge 
import java.util.Scanner;
public class InputChallenge {

    """
        read 5 valid numbers from the console and print the sum of all 5 numbers
        tell the user incase of invalid numbers - "Invalid number" through the console
        Prompt the user to enter number #X, x is number 1 through to 5
    """

    public static void main(String[] args ){
        addNumbers();
    }

    public static void addNumbers(){
        Scanner fetch = new Scanner(System.in);

        int position = 1;
        int sum = 0;
        int count = 0;

        while (count < 5){
            System.out.println("Enter number #"+ position);
            String number = fetch.nextLine();
            try {
                int convertedNumber = Integer.parseInt(number);
                sum += convertedNumber;
                position++;
                count++;
            } catch (Exception e){
                System.out.println("Invalid number!");
            }
          

        }
        System.out.println("The sum of the numbers is: "+ sum);
        
        
    }
}