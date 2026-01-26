import java.util.Scanner;
public class MinMaxChallenge {

    public static void main(String[] args){
        calculateMinMax();
    }

    public static String calculateMinMax(){
        Scanner fetch = new Scanner(System.in);
        int minNumber = 0;
        int maxNumber = 0;
        int uNumber = 0;
        
        while (true){
            
            System.out.println("Enter a number or any character to quit: ");
            String uInput = fetch.nextLine();

            try {
                uNumber = Integer.parseInt(uInput);
                if (uNumber < minNumber || uNumber < maxNumber) {
                    minNumber = uNumber;
                }
                else if (uNumber > maxNumber){
                    maxNumber = uNumber;
                    }
                }
             catch (Exception invalidInput){
                System.out.println("Exiting the loop: !!!!!");
                System.out.println("The min is "+ minNumber + " and the max is " + maxNumber);
                break;
            };

        }
        return "The min is "+ minNumber + " and the max is " + maxNumber;
    }
} 