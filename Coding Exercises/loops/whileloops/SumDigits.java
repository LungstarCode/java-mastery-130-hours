class SumDigits {

    public static void main(String [] args){
        System.out.println("The sum of all the digits in 1970 is "+ sumDigits(1970));
        System.out.println("The sum of all the digits in 6 is "+ sumDigits(6));

    }
    public static int sumDigits(int number){
        if (number < 0 ) return -1;
        if (number < 10) return number;
        int sum = 0;

        while (number >= 10){
            
            sum += (number % 10);
            number = number / 10;
        }
        sum += number;
        return sum;
    }
}