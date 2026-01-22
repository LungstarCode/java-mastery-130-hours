class DivisibleBy3and5 {

    public static void main(String[] args ){
        int sum = 0;
        int count = 0;
        for (int i = 1 ; i <= 1000; i++){
            if ((i % 3 == 0 && i % 5 == 0) && count < 5){
                System.out.println(i + " is divisible by 3 and 5.");
                sum += i;
                count++;
            }
            
        }
        System.out.println("The sum of all the numbers is "+ sum);
    }
}