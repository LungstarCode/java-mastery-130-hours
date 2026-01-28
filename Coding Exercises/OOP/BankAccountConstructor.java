public class BankAccount{

    private static String name;
    private static String accountNumber;
    private static String cellNumber;
    private static double balance;
    private static String email;


    public static void main(String[] args ){

    }

    public static void deposit(double depositAmoint){
        if (depositAmoint > 0){
            balance += depositAmoint;
        } else System.out.print("You cannot deposit a negative amount!");
    }

    public String getName(){ return name;}
    public String getEmail() {return email;}
    public String getAccountNumber() {return accountNumber;}
    public String getCellNumber() {return cellNumber;}
    public double getBalance() {return balance};

}