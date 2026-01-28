public class BankAccount{

    private static String name;
    private static String accountNumber;
    private static String cellNumber;
    private static double balance;
    private static String email;

    public BankAccount(String name , String account , String cell , String email, double balance){
        this.name = name;
        this.accountNumber = account;
        this.email = email;
        this.cellNumber = cell;
        this.balance = balance;
    }
    public static void main(String[] args ){
        BankAccount lungilesBank = new BankAccount("Lungile", "12343543","0712107897", "lungilemawila5@gmail.com", 1000.00d);
        lungilesBank.deposit(10000);
        lungilesBank.withdraw(2000);
    }

    public static void deposit(double depositAmount){
        if (depositAmount > 0){
            balance += depositAmount;
            System.out.println("A successful deposit of R"+ depositAmount + 
            " was made and your new balnce is R"+ balance);
        } else {System.out.print("You cannot deposit a negative amount!");}
    }

    public static void withdraw(double withdrawalAmount){
        if (balance - withdrawalAmount > 0){
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of R"+ withdrawalAmount + " was" + 
            " successful, your new balance is R"+ balance);
        } else {System.out.println("Insufficent funds, R"+balance);}
    }

    public String getName(){ return name;}
    public String getEmail() {return email;}
    public String getAccountNumber() {return accountNumber;}
    public String getCellNumber() {return cellNumber;}
    public double getBalance() {return balance;};

}