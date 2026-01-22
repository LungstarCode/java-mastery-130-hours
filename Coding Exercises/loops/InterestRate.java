public class InterestRate {
    public static void main(String[] args){
        for (double rate = 7.5; rate <=10; rate += 0.25){
            double interestAmount = callculateInterest(100, rate);
            System.out.println("100 at "+ rate + "% interest is " + interestAmount);
        }
    }

    public static double callculateInterest(double amount , double interestRate){
        return (amount * (interestRate / 100));
    }
}