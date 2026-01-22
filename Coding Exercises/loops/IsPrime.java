public class isPrime{

    public static void main(String[] args){
        int primeCounter = 0;
        for (int _i = 0; _i <= 1000 ; _i++){
            if (isPrime(_i)){
                primeCounter += 1;
                System.out.println(_i + " is a prime number");
            } 
            if (primeCounter >= 3) break;
        }

        System.out.println("We found "+ primeCounter + " prime numbers");

    }

    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2) return (wholeNumber == 2);

        for (int divisor = 2; divisor <= wholeNumber /2; divisor++){
            if (wholeNumber % 2 == 0) return false;
        }
        return true;
    }
}