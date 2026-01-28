class BankAccount{

    private static int acc_number;
    private static double acc_balance;
    private static String customer_name;
    private static String email;
    private static Long phone_number;

    public static void main(String[] args ){
        BankAccount bank = new BankAccount();
        bank.setCustomerName("Lungile Mawila");
        bank.setAccountNumber(1245635663);
        bank.setBalance(29800.98D);
        bank.setEmail("lungilemawila5@gmail.com");
        bank.setPhoneNumber(0712107L);

        bank.deposit(10000.00);
        bank.withdraw(2000);
    }

    public void setAccountNumber(int acc){
        this.acc_number = acc;
    }

    public void setBalance(double balance){
        this.acc_balance = balance;
    }

    public void setCustomerName(String name){
        this.customer_name = name;
    }

    public void setPhoneNumber(Long phone){
        this.phone_number = phone;
    }

    public void setEmail(String mail){
        this.email = mail;
    }

    // Getters 

    public int getAccountNumber(){
        return this.acc_number;
    }

    public double getBalance(){
        return this.acc_balance;
    }

    public String getName(){
        return this.customer_name;
    }

    public String getEmail(){
        return this.email;
    }

    public Long getPhoneNumber(){
        return this.phone_number;
    }

    // methods 

    public static void deposit(double amount ){
        BankAccount bank = new BankAccount();
        if (amount > 0 ){
            acc_balance += amount;
            System.out.println("Hello "+ bank.getName() + " your new balance is "+ bank.getBalance());
        } else {
            System.out.println("You can not deposit an invalid amount (negative funds)");
        }
    }

    public static void withdraw(double amount){
        BankAccount bank = new BankAccount();
        if (acc_balance > amount){
            acc_balance -= amount;
            System.out.println("Hello "+ bank.getName() + "Your withdrawla was successful and  Your new balance is "+ bank.getBalance());
        }
        else {
            System.out.println("You have insufient funds for this withdrawal, your balance is R"+ acc_balance);
        }
    }
    

}